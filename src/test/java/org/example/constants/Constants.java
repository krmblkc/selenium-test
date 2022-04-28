package org.example.constants;

import org.openqa.selenium.By;

public class Constants {
    public static final By LOG_IN_BUTTON = By.className("btn-login");
    public static final By EMAIL_AREA = By.name("username");
    public static final By PASSWORD_AREA = By.name("password");
    public static final By ADD_PROJECT_LINK = By.xpath("//*[@id=\"nav-accordion\"]/li[1]/ul/li[1]/a");
    public static final By OFFER_PROJECT_NAME = By.id("offerProjectName");
    public static final By OFFER_PROJECT_NO = By.id("projectNumber");
    public static final By PROJECT_NAME = By.id("name");
    public static final By PLANNING_START_DATE = By.id("planningStartDate");
    public static final By SURVEY_TYPE = By.id("surveyType");
    public static final By OPTION_PROJECT_TYPE = By.xpath("//*[@id=\"surveyType\"]/option[3]");

}
