package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    protected By submitLogIn = By.xpath("//*[@id='app']/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button");

    public LogInPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public WebElement getSubmitLogIn() {
        return getDriver().findElement(submitLogIn);
    }

    public void enterLogInData(String email, String password) {

        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubmitLogIn().click();

    }

}
