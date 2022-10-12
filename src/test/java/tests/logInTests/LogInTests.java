package tests.logInTests;
/*
//Test #1: Visits the login page
    //assert:
    //Verifikovati da se u url-u stranice javlja ruta /login
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import tests.BaseTest;

public class LogInTests extends BaseTest {

    @Test
    public void VisitsTheLoginPage() throws InterruptedException {

        homePage.logInButton();
        Thread.sleep(1000);
        String expectedResult = "/login";
        String logInUrl = driver.getCurrentUrl();
        Assert.assertTrue(logInUrl.contains(expectedResult));

    }



}
/*
 if(driver.findElement(By.xpath("//*[@id='someID']")).isDisplayed()){
        driver.findElement(By.xpath("//*[@id='someID']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='someID']")));
        currentURL = driver.getCurrentUrl();
        //prototype. indexOf()
        /*String logInUrl = null;
        logInUrl = driver.getCurrentUrl();
        boolean actualResult = false;
        if (logInUrl.contains(expectedResult)) {
            actualResult = true;
        }else {
            actualResult = false;
        }
        */
