package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LogInPage;

import java.time.Duration;

public abstract class BaseTest {
    protected LogInPage logInPage;
    protected HomePage homePage;
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    protected Faker faker;

    public Faker getFaker() {
        return faker;
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\bootcamp\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        logInPage = new LogInPage(driver, driverWait);
        homePage = new HomePage(driver, driverWait);
        /*faker = new Faker();*/

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://vue-demo.daniel-avellaneda.com ");
        logInPage = new LogInPage(driver, driverWait);
        homePage = new HomePage(driver, driverWait);
    }
}

