package org.example.page;

import static org.example.constants.Constants.*;
import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginAndFillProjectAddPage extends BasePage {
    public LoginAndFillProjectAddPage(WebDriver driver) {
        super(driver);
    }

    public LoginAndFillProjectAddPage clickLogin(){
        click(LOG_IN_BUTTON);
        return this;
    }

    public LoginAndFillProjectAddPage sendEmail(){
        sendKeys(EMAIL_AREA,"username");
        return this;
    }

    public LoginAndFillProjectAddPage sendPassword(){
        sendKeys(PASSWORD_AREA,"password");
        return this;
    }

    public void clickAddProject(){
        click(ADD_PROJECT_LINK);
    }

    public void waitSeconds(long time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);
    }

    public LoginAndFillProjectAddPage sendOffer(){
        sendKeys(OFFER_PROJECT_NAME,"Jekirdek");
        return this;
    }

    public LoginAndFillProjectAddPage sendProjectNo(){
        sendKeys(OFFER_PROJECT_NO,"1111");
        return this;
    }

    public LoginAndFillProjectAddPage sendProjectName(){
        sendKeys(PROJECT_NAME,"Jekirdek");
        return this;
    }

    public LoginAndFillProjectAddPage sendDate(){
        sendKeys(PLANNING_START_DATE,"07/04/2022");
        return this;
    }

    public LoginAndFillProjectAddPage clickSurveyType(){
        click(SURVEY_TYPE);
        return this;
    }

    public LoginAndFillProjectAddPage selectSurveyType(){
        click(OPTION_PROJECT_TYPE);
        return this;
    }
}
