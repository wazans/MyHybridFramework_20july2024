package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(com.testcompany.MyListenerPack.MyTestListens.class)
public class LoginTest extends BaseTest {

    /*
    Instance of LoginPage.
     */
    public LoginPage lp;

    public LoginTest() throws IOException {
        super();
    }

    @BeforeMethod
    @Parameters({"username", "password"})
    public void BeforeTest_intiliasie(String username, String password) {
        /*
        Calls the initialization() method from BaseTest to set up the WebDriver.
         */
        //initialization();
        /*
        Initializes the LoginPage instance (lp).
         */
        lp = new LoginPage(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @Test
    public void LoginTestSequence() {

        lp.selectLocation();
        lp.clickLoginButton();
    }
    /*
    Flow Overview
            LoginTest Constructor:Calls BaseTest constructor to load properties.
            BeforeTest_intiliasie Method:Calls initialization method to set up WebDriver.
            Initializes LoginPage and enters username and password.
            LoginTestSequence Method:
                    Selects location and clicks login button using LoginPage methods.
     */
}
