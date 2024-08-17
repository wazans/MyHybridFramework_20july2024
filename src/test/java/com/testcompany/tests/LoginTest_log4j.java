package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest_log4j extends BaseTest {

    public LoginPage lp;

    public LoginTest_log4j() throws IOException {
        super();
    }

    @BeforeMethod
    @Parameters({"username", "password"})
    public void BeforeTest_initialise(String username, String password) {
        lp = new LoginPage(driver);
        logInfo("Initializing login with username: " + username);
        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @Test
    public void LoginTestSequence() {
        logInfo("Starting login test sequence.");
        lp.selectLocation();
        lp.clickLoginButton();
    }
}
