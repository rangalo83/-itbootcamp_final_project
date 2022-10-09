package tests.logInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

/*
Test #2: Checks input types
assert:
Verifikovati da polje za unos emaila za atribut type ima vrednost email
Verifikovati da polje za unos lozinke za atribut type ima vrednost password


 */
public class ChecksLoginInputTypes extends BaseTest {


    @Test

    public void CheckInputTypesTest() {
        homePage.logInButton();
        logInPage.enterLogInData();
        String expectedResultEmail = "email";
        String expectedResultPassword = "password";
        String actualResultEmail = logInPage.getEmailField().getAttribute("type");
        Assert.assertEquals(expectedResultEmail, actualResultEmail);
        String actualResultPassword;
        actualResultPassword = logInPage.getPasswordField().getAttribute("type");
        Assert.assertEquals(expectedResultPassword, actualResultPassword);
    }
}
