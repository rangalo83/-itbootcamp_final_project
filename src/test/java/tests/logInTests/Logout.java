package tests.logInTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Logout extends BaseTest {
    /*
    Test #6: Logout
    assert:
    Verifikovati da je dugme logout vidljivo na stranici
    Verifikovati da se u url-u stranice javlja /login ruta
    Verifikovati da se nakon pokušaja otvaranja /home rute, u url-u stranice javlja /login ruta (otvoriti sa driver.get home page i proveriti da li vas redirektuje na login)
    */

    @Test
    public void logoutTest() throws InterruptedException {
        homePage.logInButton();
        String email = "admin@admin.com";
        String password = "12345";
        logInPage.enterLogInData(email, password);
        Thread.sleep(3000);
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/header/div/div[3]/button[1]"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}
