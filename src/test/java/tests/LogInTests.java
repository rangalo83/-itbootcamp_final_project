package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class LogInTests extends BaseTest{

    //Test #1: Visits the login page
    //assert:
    //Verifikovati da se u url-u stranice javlja ruta /login
    private WebDriver driver;
    private WebDriverWait driverWait;
    @Test
    public void VisitsTheLoginPage(){
        String expectedResult = "/login";
        homePage.logInButton();
        //prototype. indexOf()
        String logInUrl = driver.getCurrentUrl();


    }



}
