package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    protected By submitLogIn = By.xpath("//*[@id='app']/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button");
    protected Faker faker = new Faker();

    public LogInPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
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

    public void enterValidEmailInvalidPassword(){
        String email = "admin@admin.com";
        String fakePassword = faker.internet().password();
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(fakePassword);
        getSubmitLogIn().click();
    }
}
