package jp.co.tis.tiscon3.controller;

import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import jp.co.tis.tiscon3.dao.CardOrderDao;
import jp.co.tis.tiscon3.entity.CardOrder;
import jp.co.tis.tiscon3.form.CardOrderForm;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import java.util.List;

public class DbDumpController {
    @Inject
    private DomaProvider daoProvider;

    private CardOrderDao cardOrderDao;
    @PostConstruct
    public void init() {
        cardOrderDao = daoProvider.getDao(CardOrderDao.class);
    }

    public HttpResponse get() {
        String body = "";
        List<CardOrder> cardOrderList = cardOrderDao.selectAll();

        StringBuilder sb = new StringBuilder(1024);
        sb.append("db dump\n");
        for(CardOrder co : cardOrderList) {
            sb.append(co.toString());
            sb.append('\n');
        }
        HttpResponse response = HttpResponse.of(sb.toString());
        response.setContentType("text/plain");
        return response;
    }
}
