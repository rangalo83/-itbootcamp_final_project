package tests.logInTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DisplayErrorsWhenPasswordIsWrong extends BaseTest {

    /*
    Podaci: email: admin@admin.com i proizvoljan password
    asssert:
    Verifikovati da greska sadrzi poruku Wrong password
    Verifikovati da se u url-u stranice javlja /login ruta
    */

    @Test
    public void DisplayErrorsWhenPasswordIsWrongTest(){
        homePage.logInButton();
        logInPage.enterValidEmailInvalidPassword();
        WebElement wrongPasswordBox = driver.findElement(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div"));
        Assert.assertTrue(wrongPasswordBox.isDisplayed());
        String expectedResult = "/login";
        String logInUrl = driver.getCurrentUrl();
        Assert.assertTrue(logInUrl.contains(expectedResult));

    }
}
