package org.example.test;

import org.example.base.BaseTest;
import org.example.page.LoginAndFillProjectAddPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class LoginAndFillAddProjectTest extends BaseTest {
    LoginAndFillProjectAddPage loginAndFillProjectAddPage;

    @Before
    public void before(){
        loginAndFillProjectAddPage = new LoginAndFillProjectAddPage(getWebDriver());
    }

    @Test
    public void test() throws InterruptedException {
        loginAndFillProjectAddPage.sendEmail().sendPassword().clickLogin();
        loginAndFillProjectAddPage.waitSeconds(10);
        loginAndFillProjectAddPage.clickAddProject();
        loginAndFillProjectAddPage.waitSeconds(10);
        loginAndFillProjectAddPage.sendOffer().sendProjectNo().sendProjectName().sendDate().clickSurveyType().selectSurveyType();
    }
}
