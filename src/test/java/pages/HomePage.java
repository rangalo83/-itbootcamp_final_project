package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    protected By logIn = By.xpath("//*[@id='app']/div/div/header/div/div[3]/a[3]");
    protected By signUp = By.xpath("//*[@id='app']/div/div/header/div/div[3]/a[4]");
    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLogIn() {
        return getDriver().findElement(logIn);
    }
    public WebElement getSignUp() {
        return getDriver().findElement(signUp);
    }

    public void logInButton() {
        WebElement logInButton = getLogIn();
        logInButton.click();
    }

    public void signUpButton() {
        WebElement signUpButton = getSignUp();
        signUpButton.click();
    }
}
