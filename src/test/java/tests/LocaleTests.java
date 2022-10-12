package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BaseTest{
    @Test
    public void setLocaleToES(){
        /*
    assert:
    Set language to ES
    Verify that header contains text Página de aterrizaje
    */
        homePage.getLanguage().click();
        homePage.languageEsButton();
        String expectedResult = "Página de aterrizaje";
        String actualResult = homePage.getHeader().getText();
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void setLocaleToEN(){
        /*
    assert:
    Set language to EN
    Verify that header contains text Landing    */
        homePage.getLanguage().click();
        homePage.languageEnButton();
        String expectedResult = "Landing";
        String actualResult = homePage.getHeader().getText();
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void setLocaleToFR(){
    /*
    assert:
    Set language to FR
    Verify that header contains text Page d'atterrissage
     */
        homePage.getLanguage().click();
        homePage.languageFrButton();
        String expectedResult = "Page d'atterrissage";
        String actualResult = homePage.getHeader().getText();
        Assert.assertEquals(actualResult, expectedResult);
    }


}
