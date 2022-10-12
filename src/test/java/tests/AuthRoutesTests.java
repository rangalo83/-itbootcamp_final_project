package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BaseTest {
    @Test
    public void ForbidsVisitsToHomeUrlIfNotAuthenticated() {
    /*
    assert:
    Ucitati /home stranu kada korisnik nije ulogovan
    Verifikovati da se u url-u stranice javlja ruta /login
    */
        driver.get("https://vue-demo.daniel-avellaneda.com/home");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

}
