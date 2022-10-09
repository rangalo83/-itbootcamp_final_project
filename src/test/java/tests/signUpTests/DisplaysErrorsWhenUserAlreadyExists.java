package tests.signUpTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DisplaysErrorsWhenUserAlreadyExists extends BaseTest {
    /*
    Podaci:
    name: Test Test
    email: admin@admin.com
    password: 123654
    confirm password: 123654
    assert:
    Verifikovati da greska sadrzi poruku E-mail already exists
    Verifikovati da se u url-u stranice javlja /signup ruta
    */
    @Test
    public void DisplayErrorsWhenUserAlredyExistTest() throws InterruptedException {
        homePage.signUpButton();
        signUpPage.signUpPageData();
        Thread.sleep(2000);
        String expectedResults = "E-mail already exists";
        WebElement emailAlreadyExistsBox = driver.findElement(By.xpath("//*[@id='app']/div[1]/main/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/ul/li"));
        String actualResult = emailAlreadyExistsBox.getText();
        Assert.assertEquals(expectedResults, actualResult);
    }

    @Test
    public void signUpUrlTest(){
        homePage.signUpButton();
        String expectedResult = "/signup";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }



}
