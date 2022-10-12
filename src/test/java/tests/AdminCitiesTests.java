package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    Verify Log Out button existanse.
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

    @Test
    public void createNewCityTest() throws InterruptedException {
    /*
    Data: random city using faker library
    assert:
    Verify that pop up message contains text  Saved successfully

     */
        homePage.logInButton();
        String email = "admin@admin.com";
        String password = "12345";
        logInPage.enterLogInData(email, password);
        homePage.adminButton();
        homePage.citiesButton();
        String randomCityName = faker.address().cityName();
        citiesPage.nameCityData(randomCityName);
        String expectedResults = "Saved successfully\nCLOSE";
        String actualResults = citiesPage.getSuccessfulSaveMsgBox().getText();
        Assert.assertEquals(actualResults, expectedResults);

    }

}
