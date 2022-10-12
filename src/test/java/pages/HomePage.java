package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    protected By logIn = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]");
    protected By signUp = By.xpath("//*[@id='app']/div/div/header/div/div[3]/a[4]");
    protected By admin = By.xpath("//*[@id='app']/div[1]/div/header/div/div[3]/button[1]");
    protected By cities = By.xpath("//*[@id='app']/div[3]/div/a[1]");
    protected By logout = By.xpath("//*[@id='app']/div[1]/div/header/div/div[3]/button[2]");
    protected By language = By.xpath("//*[@id=\"app\"]/div/div/header/div/div[3]/button");
    protected By languageEs = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]");
    protected By languageEn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]");
    protected By languageFr = By.xpath("//*[@id=\"app\"]/div[2]/div/div[3]");


    protected By header = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLogIn() {
        return getDriver().findElement(logIn);
    }

    public WebElement getSignUp() {
        return getDriver().findElement(signUp);
    }

    public WebElement getAdmin() {
        return getDriver().findElement(admin);
    }

    public WebElement getCities() {
        return getDriver().findElement(cities);
    }

    public WebElement getLogOut() {
        return getDriver().findElement(logout);
    }
    public WebElement getLanguage(){
        return getDriver().findElement(language);
    }
    public WebElement getLanguageEs(){
         return getDriver().findElement(languageEs);
    }
    public WebElement getLanguageEn(){
        return getDriver().findElement(languageEn);
    }
    public WebElement getLanguageFr(){
        return getDriver().findElement(languageFr);
    }

    public WebElement getHeader(){
        return getDriver().findElement(header);
    }

    public void logInButton() {
        WebElement logInButton = getLogIn();
        logInButton.click();
    }

    public void signUpButton() {
        WebElement signUpButton = getSignUp();
        signUpButton.click();
    }

    public void adminButton() {
        WebElement adminButton = getAdmin();
        adminButton.click();

    }

    public void citiesButton() {
        WebElement citiesButton = getCities();
        citiesButton.click();
    }
    public void languageEsButton(){
        WebElement languageEsButton = getLanguageEs();
        languageEsButton.click();
    }
    public void languageEnButton(){
        WebElement languageEnButton = getLanguageEn();
        languageEnButton.click();
    }
    public void languageFrButton(){
        WebElement languageFrButton = getLanguageFr();
        languageFrButton.click();
    }

    public void logOutButton(){
        WebElement logOutButton = getLogOut();
        logOutButton.click();
    }
}
