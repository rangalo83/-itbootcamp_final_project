package tests.logInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest extends BaseTest {
    /*
    Test #5: Login
    Podaci:
    email: admin@admin.com
    password: 12345
    asssert:
    Verifikovati da se u url-u stranice javlja /home ruta

     */
    @Test
    public void loginTest() throws InterruptedException {
        homePage.logInButton();
        String email = "admin@admin.com";
        String password = "12345";
        logInPage.enterLogInData(email, password);
        Thread.sleep(3000);
        String expectedResult = "/home";
        String userHomePageUrl = driver.getCurrentUrl();
        Assert.assertTrue(userHomePageUrl.contains(expectedResult));

    }
}
