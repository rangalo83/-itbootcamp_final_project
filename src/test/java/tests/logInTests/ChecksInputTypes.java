package tests.logInTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

/*
Test #2: Checks input types
assert:
Verifikovati da polje za unos emaila za atribut type ima vrednost email
Verifikovati da polje za unos lozinke za atribut type ima vrednost password


 */
public class ChecksInputTypes extends BaseTest {



    @Test

    public void CheckInprutTypesTest() throws InterruptedException {
        homePage.logInButton();
        logInPage.enterLogInData();
        Thread.sleep(3000);
        String expectedResultEmail = "email";
        String expectedResultPassword = "password";
        String actualResultEmail;
        actualResultEmail = logInPage.getEmailField().getAttribute("type");
        Assert.assertEquals(expectedResultEmail, actualResultEmail);
        String actualResultPassword = logInPage.getPasswordField().getAttribute("type");
        Assert.assertEquals(expectedResultPassword, actualResultPassword);



    }



}
