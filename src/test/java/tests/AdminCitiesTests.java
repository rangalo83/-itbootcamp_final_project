package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCitiesTests extends BaseTest {

    /*
    Visits the admin cities page and list cities
    Data:
    admin email: admin@admin.com
    admin password: 12345
    assert:
    Verify that url contains /admin/cities rout
    Verifikovati postojanje logout dugmeta
    */
    @Test

    public void visitsTheAdminCitiesPageAndListCitiesTest() throws InterruptedException {
        homePage.logInButton();
        String email = "admin@admin.com";
        String password = "12345";
        logInPage.enterLogInData(email, password);

        Thread.sleep(1000);
        homePage.adminButton();
        Thread.sleep(1000);
        homePage.citiesButton();
        Thread.sleep(1000);
        String expectedResults = "/admin/cities";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResults));
        Assert.assertTrue(homePage.getLogOut().isDisplayed());
    }

}
