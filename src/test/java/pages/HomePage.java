package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    protected By logIn = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLogIn() {
        return getDriver().findElement(logIn);
    }

    public void logInButton() {
        WebElement logInButton = getLogIn();
        logInButton.click();
    }
}
