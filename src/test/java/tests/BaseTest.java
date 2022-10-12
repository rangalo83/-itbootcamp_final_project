package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CitiesPage;
import pages.HomePage;
import pages.LogInPage;
import pages.SignUpPage;

import java.time.Duration;

public abstract class BaseTest {
    protected LogInPage logInPage;
    protected SignUpPage signUpPage;
    protected HomePage homePage;
    protected CitiesPage citiesPage;
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
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        logInPage = new LogInPage(driver, driverWait);
        homePage = new HomePage(driver, driverWait);
        signUpPage = new SignUpPage(driver, driverWait);
        citiesPage = new CitiesPage(driver, driverWait);
        faker = new Faker();

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

