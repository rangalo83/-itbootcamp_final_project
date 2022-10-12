package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CitiesPage extends BasePage {
    protected By newItem = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/div[3]/form/div[1]/button");
    protected By nameCity = By.id("name");
    protected By saveButton = By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[3]/button[2]");
    protected By successfulSaveMsgBox = By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[3]/div/div/div/div/div[1]");
    protected By edit = By.id("edit");
    protected List<WebElement> cities = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[2]/table/tbody/td[2]"));


    public CitiesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getNewItem() {
        return getDriver().findElement(newItem);
    }

    public WebElement getNameCity() {
        return getDriver().findElement(nameCity);
    }

    public WebElement getSaveButton() {
        return getDriver().findElement(saveButton);
    }

    public WebElement getSuccessfulSaveMsgBox(){
        return getDriver().findElement(successfulSaveMsgBox);
    }
    public WebElement getEdit(){
        return getDriver().findElement(edit);
    }


    public List<WebElement> getCities() {
        return cities;
    }

    public void nameCityData(String cityName) {
        getNewItem().click();
        getNameCity().sendKeys(cityName);
        getSaveButton().click();
    }

    public void editCity(String cityName){
        for (int i = 0; i < cities.size(); i++){
            String city = cities.get(i).getText();
            if (city.equals(cityName)){
                getEdit().click();
            }
        }
    }
}