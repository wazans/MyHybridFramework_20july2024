package com.testcompany.tests;

import com.testcompany.base.BaseTest;
import com.testcompany.pages.LoginPage_PageFactory;
import com.testcompany.utils.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest_DataProvider_Excel extends BaseTest {

    /*
    Instance of LoginPage.
     */
    public LoginPage_PageFactory lp;

    public LoginTest_DataProvider_Excel() throws IOException {
        super();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws IOException {
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/loginData.xlsx", "Sheet1");
        return excelUtil.getExcelData();
    }

    @Test(dataProvider = "loginData")
    public void LoginWithExcel(String username, String password) {
        /*
        Calls the initialization() method from BaseTest to set up the WebDriver.
         */
        initialization();
        /*
        Initializes the LoginPage instance (lp).
         */
        lp = new LoginPage_PageFactory(driver);
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.selectLocation();
        lp.clickLoginButton();
    }

//    @Test(dataProvider = "logindata")
//    @dataprovider(name=loginData)
}
