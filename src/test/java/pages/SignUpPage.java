package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {
    protected By nameField = By.id("name");
    protected By confirmPassword = By.id("confirmPassword");
    protected By singMeUpButton = By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div[5]/button");
    protected Faker faker = new Faker();

    public SignUpPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getNameField() {
        return getDriver().findElement(nameField);
    }

    public WebElement getConfirmPassword() {
        return getDriver().findElement(confirmPassword);
    }

    public WebElement getSingMeUpButton() {
        return getDriver().findElement(singMeUpButton);
    }

    public void signUpPageData() {
        getNameField().sendKeys("Test Test");
        getEmailField().sendKeys("admin@admin.com");
        getPasswordField().sendKeys("123654");
        getConfirmPassword().sendKeys("123654");
        getSingMeUpButton().click();
    }
    public void signUpDataNameLastName(){
        getNameField().sendKeys("Goran Pincir");
        String fakeEmail = faker.internet().emailAddress();
        getEmailField().sendKeys(fakeEmail);
        getPasswordField().sendKeys("123456");
        getConfirmPassword().sendKeys("123456");
        getSingMeUpButton().click();
    }

}
