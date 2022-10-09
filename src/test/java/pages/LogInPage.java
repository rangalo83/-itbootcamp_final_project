package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    protected By emailField = By.id("email");
    protected By passwordField = By.id("password");
    protected By submitLogIn = By.xpath("//*[@id='app']/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button");
    Faker faker = new Faker();

    public LogInPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getEmailField() {
        return getDriver().findElement(emailField);
    }

    public WebElement getPasswordField() {
        return getDriver().findElement(passwordField);
    }

    public WebElement getSubmitLogIn() {
        return getDriver().findElement(submitLogIn);
    }

    public void enterLogInData() {

        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().sendKeys("12345");
        getSubmitLogIn().click();

    }
   public void enterFakeLoginData(){
        String fakeEmail = faker.internet().emailAddress();
        String fakePassword = faker.internet().password();
        getEmailField().sendKeys(fakeEmail);
        getPasswordField().sendKeys(fakePassword);
        getSubmitLogIn().click();

    }
}
