package tests.signUpTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckSignUpPageInputTypes extends BaseTest {
    /*
    assert:
    Verifikovati da polje za unos emaila za atribut type ima vrednost email
    Verifikovati da polje za unos lozinke za atribut type ima vrednost password
    Verifikovati da polje za unos lozinke za potvrdu za atribut type ima vrednost password
    */
    @Test
    public void checkSignUpInputTypesTest(){
        homePage.signUpButton();
        String expectedResultEmail = "email";
        String expectedResultPassword = "password";
        String expectedResultConfirmPassword = "password";
        String actualResultEmail = signUpPage.getEmailField().getAttribute("type");
        String actualResultPassword = signUpPage.getPasswordField().getAttribute("type");
        String actualResultConfirmPassword = signUpPage.getConfirmPassword().getAttribute("type");
        Assert.assertEquals(expectedResultEmail, actualResultEmail);
        Assert.assertEquals(expectedResultPassword, actualResultPassword);
        Assert.assertEquals(expectedResultConfirmPassword, actualResultConfirmPassword);



    }

}
