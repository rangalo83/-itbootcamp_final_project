package tests.signUpTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class VisitsTheSignupPage extends BaseTest {
    //assert:
    //Verifikovati da se u url-u stranice javlja /signup ruta

    @Test

    public void visitTheSignUpPageTest() throws InterruptedException {
        homePage.signUpButton();
        Thread.sleep(3000);
        String expectedResult = "/signup";
        String signUpPageUrl = driver.getCurrentUrl();
        Assert.assertTrue(signUpPageUrl.contains(expectedResult));
    }


}
