package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage;
import com.testcompany.pages.ManageServiceTypesPage;
import com.testcompany.pages.ScheduleAppointmentPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class ManageServiceTypesTest extends BaseTest {
    public LoginPage lp;
    public ScheduleAppointmentPage sap;
    public ManageServiceTypesPage mst;


    public ManageServiceTypesTest() throws IOException {
        super();
    }


    @BeforeMethod
    @Parameters({"username", "password"})
    public void setup(String username, String password)
    {   lp=new LoginPage(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
        sap=new ScheduleAppointmentPage(driver);
        sap.clickOnScheduleAppointment();
    }

    @Test
    public void ManageServiceTypes()
    {
        mst=new ManageServiceTypesPage(driver);
        mst.ManageServiceType_click();
    }
}
