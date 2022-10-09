package tests.logInTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

/*
Podaci: random email i password koristeći faker libarary
asssert:
Verifikovati da greska sadrzi poruku User does not exists
Verifikovati da se u url-u stranice javlja /login ruta
 */
public class DisplaysErrorsWhenUserDoesNotExist extends BaseTest {

    @Test
    public void DisplaysErrorsWhenUserDoesNotExistTest() throws InterruptedException {
        homePage.logInButton();
        logInPage.enterFakeLoginData();
        WebElement userNotExistBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div"));
        Assert.assertTrue(userNotExistBox.isDisplayed());
        //homePage.logInButton();
        Thread.sleep(3000);
        String expectedResult = "/login";
        String logInUrl = driver.getCurrentUrl();
        Assert.assertTrue(logInUrl.contains(expectedResult));
    }
}
