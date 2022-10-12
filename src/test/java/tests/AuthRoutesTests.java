package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BaseTest {
    @Test
    public void ForbidsVisitsToHomeUrlIfNotAuthenticated() {
    /*
    assert:
    Load /home route when user is not loged in
    Verify that url contains  /login rout
    */
        driver.get("https://vue-demo.daniel-avellaneda.com/home");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @Test
    public void forbidsVisitsToProfileUrlIfNotAuthenticated(){
        /*
        assert:
        Ucitati /profile stranu
        Verifikovati da se u url-u stranice javlja ruta /login
        */
        driver.get("https://vue-demo.daniel-avellaneda.com/profile");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
