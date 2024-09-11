package com.testcompany.tests;

import com.testcompany.pages.LoginPage_PageFactory;
import com.testcompany.pages.ScheduleAppointmentPage;
import com.testcompany.webdriver.CreateDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestSingletonWithSingleton {

    /*
    Instance of LoginPage.
     */
    public LoginPage_PageFactory lp;
    public ScheduleAppointmentPage sap;


    @BeforeMethod
    private void SetUp()
    {
        CreateDriver.getINSTANCE().setDriver();
        CreateDriver.getINSTANCE().getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @Parameters({"username", "password"})
    @Test
    public void LoginTestParallel(String username, String password) {
        //initialization();
        lp = new LoginPage_PageFactory(CreateDriver.getINSTANCE().getDriver());
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
        CreateDriver.getINSTANCE().getDriver().quit();
    }

    @Parameters({"username", "password"})
    @Test
    public void ScheduleAppointmentTest_Parallel(String username, String password) {
        //initialization();
        sap = new ScheduleAppointmentPage(CreateDriver.getINSTANCE().getDriver());
        lp = new LoginPage_PageFactory(CreateDriver.getINSTANCE().getDriver());
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
        sap.clickOnScheduleAppointment();
        CreateDriver.getINSTANCE().getDriver().quit();

    }
}
