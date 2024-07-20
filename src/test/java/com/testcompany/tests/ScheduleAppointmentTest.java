package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage;
import com.testcompany.pages.ScheduleAppointmentPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScheduleAppointmentTest extends BaseTest {
    public ScheduleAppointmentPage sap;
    public LoginPage lp;

    public ScheduleAppointmentTest() throws IOException {
        super();
    }

    @BeforeMethod
    @Parameters({"username", "password"})
    public void setup(String username, String password) {
        //initialization();
        lp=new LoginPage(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();

    }

    @Test
    public void ScheduleAppointment() {
        sap = new ScheduleAppointmentPage(driver);
        sap.clickOnScheduleAppointment();

    }
}