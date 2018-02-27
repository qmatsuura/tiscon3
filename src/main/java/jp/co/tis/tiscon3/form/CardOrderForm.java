package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    /* 名前(漢字) */
    private String kanjiName;

    //@NotBlank
    @Size(max = 30)
    private String kanjiName1;

    //@NotBlank
    @Size(max = 30)
    private String kanjiName2;

    /* 名前（カナ） */
    private String kanaName;

    //@NotBlank
    @Size(max = 45)
    @Pattern(regexp = "^[ァ-ヶー]*$")
    private String kanaName1;

    //@NotBlank
    @Size(max = 45)
    @Pattern(regexp = "^[ァ-ヶー]*$")
    private String kanaName2;

    /* 名前(ローマ字) */
    private String alphabetName;

    //@NotBlank
    @Size(max = 60)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String alphabetName1;

    //@NotBlank
    @Size(max = 60)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String alphabetName2;

    /* 生年月日 */
    private String dateOfBirth;

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
    private String zipCode;

    //@NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]{3}$")
    private String zipCode1;

    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{4}$")
    private String zipCode2;

    /* 住所 */
    //@NotBlank
    @Size(max = 255)
    private String address;

    /* 自宅電話番号 */
    private String homePhoneNumber;

    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^0[0-9]{1,3}$")
    private String homePhoneNumber1;

    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{2,4}$")
    private String homePhoneNumber2;

    //@NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{4}$")
    private String homePhoneNumber3;

    /* 携帯電話番号 */
    private String mobilePhoneNumber;

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
    private String emailAddress;

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
    private String employerZipCode;

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
    private String employerPhoneNumber;

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

}
