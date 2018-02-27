package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    /* 名前(漢字) */
    //@NotBlank
    @Size(max = 30)
    private String kanjiName1;

    //@NotBlank
    @Size(max = 30)
    private String kanjiName2;

    /* 名前（カナ） */
    //@NotBlank
    @Size(max = 45)
    @Pattern(regexp = "^[ァ-ヶー]*$")
    private String kanaName1;

    //@NotBlank
    @Size(max = 45)
    @Pattern(regexp = "^[ァ-ヶー]*$")
    private String kanaName2;

    /* 名前(ローマ字) */
    //@NotBlank
    @Size(max = 60)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String alphabetName1;

    //@NotBlank
    @Size(max = 60)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String alphabetName2;

    /* 生年月日 */
    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^\\d{4}$")
    private String dateOfBirth1;

    //@NotBlank
    @Size(max = 2)
    @Pattern(regexp = "^\\d{1,2}$")
    private String dateOfBirth2;

    //@NotBlank
    @Size(max = 2)
    @Pattern(regexp = "^\\d{1,2}$")
    private String dateOfBirth3;

    /* 性別 */
    //@NotBlank
    @Size(max = 6)
    private String gender;

    /* 郵便番号 */
    //@NotBlank
    @Size(max = 3)
    //@Pattern(regexp = "^[0-9]{3}$")
    private String zipCode1;

    //@NotBlank
    @Size(max = 4)
    //@Pattern(regexp = "^[0-9]{4}$")
    private String zipCode2;

    /* 住所 */
    //@NotBlank
    @Size(max = 255)
    private String address;

    /* 自宅電話番号 */
    //@NotBlank
    @Size(max = 4)
    //@Pattern(regexp = "^0[0-9]{1,3}$")
    private String homePhoneNumber1;

    //@NotBlank
    @Size(max = 4)
    //@Pattern(regexp = "^[0-9]{2,4}$")
    private String homePhoneNumber2;

    //@NotBlank
    @Size(max = 4)
    //@Pattern(regexp = "^[0-9]{4}$")
    private String homePhoneNumber3;

    /* 携帯電話番号 */
    @Size(max = 13)
    @Pattern(regexp = "^(070|080|090)?$")
    private String mobilePhoneNumber1;

    @Size(max = 13)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String mobilePhoneNumber2;

    @Size(max = 13)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String mobilePhoneNumber3;

    /* メールアドレス */
    //@NotBlank
    @Size(max = 127)
    private String emailAddress1;

    //@NotBlank
    @Size(max = 127)
    private String emailAddress2;

    /* 配偶者の有無 */
    //@NotBlank
    @Size(max = 20)
    private String spouse;

    /* お住まい */
    //@NotBlank
    @Size(max = 20)
    private String houseClassification;

    /* ローン */
    //@NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    /* ご職業 */
    //@NotBlank
    @Size(max = 120)
    private String job;

    /* 昨年の所得 */
    //@NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    /* お勤め先名 */
    @Size(max = 255)
    private String employerName;

    /* お勤め先郵便番号 */
    //@NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^([0-9]{3})?$")
    private String employerZipCode1;

    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String employerZipCode2;

    /* お勤め先住所 */
    @Size(max = 255)
    private String employerAddress;

    /* お勤め先電話番号 */
    @Size(max = 4)
    @Pattern(regexp = "^(0[0-9]{1,3})?$")
    private String employerPhoneNumber1;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{2,4})?$")
    private String employerPhoneNumber2;

    @Size(max = 4)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String employerPhoneNumber3;

    /* 業種 */
    @Size(max = 255)
    private String industryType;

    /* 資本金 */
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    /* お勤め先の規模 (従業員数) */
    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    /* 所属部署 */
    @Size(max = 255)
    private String department;

    /* 役職 */
    @Size(max = 255)
    private String position;

    /* 勤続年数 */
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

    /*
     * データベースに格納可能な形に変換するためには，従来のフォームの内容と形式を合わせる必要がある
     * その小細工を以降でしている
     */
    public String getKanjiName() {
        if (kanjiName1 == null || kanjiName2 == null) {
            return null;
        }
        return kanjiName1 + " " + kanjiName2;
    }
    public String getKanaName() {
        if (kanaName1 == null || kanaName1 == null) {
            return null;
        }
        return kanaName1 + " " + kanaName2;
    }
    public String getAlphabetName() {
        if (alphabetName1 == null || alphabetName2 == null) {
            return null;
        }
        return alphabetName1 + " " + alphabetName2;
    }
    public String getDateOfBirth() {
        if (dateOfBirth1 == null || dateOfBirth2 == null || dateOfBirth3 == null) {
            return null;
        }
        return dateOfBirth1 + "/" + dateOfBirth2 + "/" + dateOfBirth3;
    }
    public String getZipCode() {
        if (zipCode1 == null || zipCode2 == null) {
            return null;
        }
        return zipCode1 + "-" + zipCode2;
    }
    public String getHomePhoneNumber() {
        if (homePhoneNumber1 == null || homePhoneNumber2 == null || homePhoneNumber3 == null) {
            return null;
        }
        return homePhoneNumber1 + "-" + homePhoneNumber2 + "-" + homePhoneNumber3;
    }
    public String getMobilePhoneNumber() {
        if (mobilePhoneNumber1 == null || mobilePhoneNumber1 == null || mobilePhoneNumber3 == null) {
            return null;
        }
        return mobilePhoneNumber1 + "-" + mobilePhoneNumber2 + "-" + mobilePhoneNumber3;
    }
    public String getEmailAddress() {
        if (emailAddress1 == null || emailAddress2 == null) {
            return null;
        }
        return emailAddress1 + "@" + emailAddress2;
    }
    public String getEmployerZipCode() {
        if (employerZipCode1 == null || employerZipCode2 == null) {
            return null;
        }
        return employerZipCode1 + "-" + employerZipCode2;
    }
    public String getEmployerPhoneNumber() {
        if (employerPhoneNumber1 == null || employerPhoneNumber2 == null || employerPhoneNumber3 == null) {
            return null;
        }
        return employerPhoneNumber1 + "-" + employerPhoneNumber2 + "-" + employerPhoneNumber3;
    }
}
