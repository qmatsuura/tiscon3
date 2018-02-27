package jp.co.tis.tiscon3.controller;

import enkan.component.BeansConverter;
import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import jp.co.tis.tiscon3.dao.CardOrderDao;
import jp.co.tis.tiscon3.entity.CardOrder;
import jp.co.tis.tiscon3.form.CardOrderForm;
import kotowari.component.TemplateEngine;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.transaction.Transactional;

import static enkan.util.HttpResponseUtils.RedirectStatusCode.SEE_OTHER;
import static kotowari.routing.UrlRewriter.redirect;

/**
 * カード申し込みに関するcontrollerクラス.
 *
 * @author hirano
 */
public class CardOrderController {

    @Inject
    private TemplateEngine templateEngine;

    @Inject
    private DomaProvider daoProvider;

    @Inject
    private BeansConverter beans;

    private CardOrderDao cardOrderDao;

    @PostConstruct
    public void init() {
        cardOrderDao = daoProvider.getDao(CardOrderDao.class);
    }

    /**
     * 本人登録ページを表示します.
     *
     * @return 本人登録ページresponse
     */
    public HttpResponse inputUser() {
        return templateEngine.render("cardOrder/user", "form", new CardOrderForm());
    }


    /**
     * お勤め先登録ページを表示します.
     *
     * @return お勤め先登録ページresponse
     */
    public HttpResponse inputJob(CardOrderForm form) {
        // 職業の情報の入力が必要のない職業の場合は，登録処理に飛ばす
        if (!needsInputJob(form.getJob())) {
            return create(form);
        }

        // エラーを出したくないので強制的にエラーを消す.
        form.setErrors(null);

        return templateEngine.render("cardOrder/job", "form", form);
    }

    /**
     * 本人登録ページに戻ります.
     *
     * @return 本人登録ページresponse
     */
    public HttpResponse modifyUser(CardOrderForm form) {
        // エラーを出したくないので強制的にエラーを消す.
        form.setErrors(null);

        return templateEngine.render("cardOrder/user", "form", form);
    }

    /**
     * カード申し込み情報をDatabaseに登録します.
     *
     * @return 完了ページへのリダイレクトresponse
     */
    @Transactional
    public HttpResponse create(CardOrderForm form) {
        if (form.hasErrors()) {
            return templateEngine.render("cardOrder/user", "form", form);
        }
        CardOrder cardOrder = beans.createFrom(form, CardOrder.class);

        cardOrderDao.insert(cardOrder);

        return redirect(getClass(), "completed", SEE_OTHER);
    }

    /**
     * 完了ページを表示します.
     *
     * @return 完了ページresponse
     */
    public HttpResponse completed() {
        return templateEngine.render("cardOrder/completed");
    }

    /**
     * お勤め先登録が必要なご職業か判定します．
     * 未知の職業(null, 空文字列を含む)に対してはtrue．
     *
     * @param job ご職業名
     * @return お勤め先登録が必要かどうか
     */
    private static boolean needsInputJob(final String job){
        if (job == null) {
            return true;
        }

        switch(job) {
            case "経営自営":
            case "会社員":
            case "契約派遣":
            case "公務員":
            case "民間団体":
            case "他有職":
                return true;
            case "主婦":
            case "学生":
            case "年金受給":
            case "パートアルバイト":
            case "他無職":
                return false;
        }
        return true;
    }
}
