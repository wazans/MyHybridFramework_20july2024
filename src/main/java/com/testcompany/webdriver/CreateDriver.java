package com.testcompany.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriver {
    //1
    private static CreateDriver INSTANCE;

    //4
    private ThreadLocal<WebDriver> webDriverThreadLocal=new ThreadLocal<>();

    //2
    private CreateDriver()
    {

    }


    //3
    public static CreateDriver getINSTANCE() {
        if(INSTANCE==null)
        {
            INSTANCE=new CreateDriver();
        }
        return INSTANCE;
    }

    //5
    public  void setDriver() {
        //driver=new ChromeDriver();
        webDriverThreadLocal.set(new ChromeDriver());
    }


    //6
    public  WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }


}
