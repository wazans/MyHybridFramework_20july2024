package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage;
import com.testcompany.pages.ScheduleAppointmentPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestSingleton extends BaseTest {

    /*
    Instance of LoginPage.
     */
    public LoginPage lp;
    public ScheduleAppointmentPage sap;

    public LoginTestSingleton() throws IOException {
        super();
    }
    @BeforeMethod
    private void SetUp()
    {
        driver=new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Parameters({"username", "password"})
    @Test
    public void LoginTestParallel(String username, String password) {
        //initialization();
        lp = new LoginPage(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
        //tearDown();
    }

    @Parameters({"username", "password"})
    @Test
    public void ScheduleAppointmentTest_Parallel(String username, String password) {
        //initialization();
        sap = new ScheduleAppointmentPage(driver);
        lp = new LoginPage(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
        sap.clickOnScheduleAppointment();
        //tearDown();

    }
}
