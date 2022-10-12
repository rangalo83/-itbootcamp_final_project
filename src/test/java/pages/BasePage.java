package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected By emailField = By.id("email");
    protected By passwordField = By.id("password");


    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public BasePage(By emailField, By passwordField) {
        this.emailField = emailField;
        this.passwordField = passwordField;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }
    public WebElement getEmailField(){
        return getDriver().findElement(emailField);
    }

    public WebElement getPasswordField(){
        return getDriver().findElement(passwordField);
    }

}
