package tests.signUpTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignupTest extends BaseTest {
    /*
    Podaci:
    name: Ime i prezime polaznika
    email template: faker library - email
    password: 123456
    confirm password: 123456
    assert:
    Verifikovati da dijalog za obavestenje sadrzi tekst IMPORTANT: Verify your account
    */
    @Test
    public void verifyYourAccountTest() throws InterruptedException {
        homePage.signUpButton();
        signUpPage.signUpDataNameLastName();
        Thread.sleep(2000);
        WebElement verifyYourAccountBox = driver.findElement(By.xpath("//*[@id='app']/div[4]/div/div/div[1]"));
        String expectedResult = "IMPORTANT: Verify your account";
        String actualResults = verifyYourAccountBox.getText();
        Assert.assertTrue(actualResults.contains(expectedResult));
    }
}
