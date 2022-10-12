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
    public void forbidsVisitsToProfileUrlIfNotAuthenticated() {
    /*
    assert:
    Load /profile page
    Verify that URL contains  /login route
    */
        driver.get("https://vue-demo.daniel-avellaneda.com/profile");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated() {
    /*
    assert:
    Load /admin/cities page
    Verify that URL contains /login rout
    */
        driver.get("https://vue-demo.daniel-avellaneda.com/admin/cities");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void  forbidsVisitsToAdminUsersUrlIfNotAuthenticated(){
    /*
    assert:
    Ucitati /admin/users stranu
    Verifikovati da se u url-u stranice javlja ruta /login
    */
        driver.get("https://vue-demo.daniel-avellaneda.com/admin/users");
        String expectedResult = "/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
