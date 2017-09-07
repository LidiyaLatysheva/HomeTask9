package com.epam.latysheva.businessObject;


public class Constant {
    public static final String PATH_TO_GEKODRIVER = "lib/geckodriver.exe";
    public static final String PATH_TO_CHROMEDRIVER = "lib/chromedriver.exe";

    public static final String GECKO_DRIVER_SYSTEM_PROPERTY = "webdriver.gecko.driver";
    //protected static final String LOGIN = "lida.test.2017";
    //protected static final String PASSWORD = "$ERDFC5rtfgv";
    public static final String EMAIL_DETAILS_TO = "lida.test.2017@mail.ru";
    public static final String EMAIL_DETAILS_SUBJ = "TEST email";
    public static final String EMAIL_DETAILS_BODY = "Hello, dear!";

    public static final String CHECK_BODY_IS_THE_SAME_MSG = "FAIL: Body is different";
    public static final String CHECK_EMAIL_IS_SENT_MSG = "FAIL: Email is not sent";
    public static final String CHECK_EMAIL_IS_SAVED_MSG = "FAIL: Email is not saved";
    public static final String CHECK_EMAIL_IS_IN_DRAFTS_MSG = "FAIL: Check that email appears in Drafts failed";
    public static final String CHECK_EMAIL_IS_NOT_IN_DRAFTS_MSG = "FAIL: Check that email disappears from Drafts failed";
    public static final String CHECK_EMAIL_IS_IN_SENTS_MSG = "FAIL: Check that email appears in Sents failed";
    public static final String CHECK_SEND_BTN_PRESENT_FAILED_MSG = "FAIL: Check if Send button is on the page failed";
    public static final String CHECK_LOGOUT_MSG = "FAIL: Logout was unsuccessful";
    public static final String CHECK_EMAIL_COUNT_INCREASE_MSG = "FAIL: Email count hasn't been increased by 1";
    public static final String EMAIL_COUNT_AFTER_REFRESH_MSG = "FAIL: Email count is different after refresh";
}
