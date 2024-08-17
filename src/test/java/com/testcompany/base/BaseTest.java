package com.testcompany.base;

import com.testcompany.utils.BaseLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseTest extends BaseLogger {

    /*
    WebDriver instance & Properties instance to hold configuration data.
     */
    public  static WebDriver driver;
    public  static Properties prop;
    /*
    Constructor -> BaseTest():
        Initializes the prop object.
        Loads the properties file login.properties from src/main/resources/.
     */

    public BaseTest() throws IOException{
        //wasim
        prop= new Properties();
        //FileInputStream fis=new FileInputStream("./resources/login.properties");
        FileInputStream fis=new FileInputStream("src/main/resources/ login.properties");
        prop.load(fis);

    }

    /*
    Methods
        initialization():
                Reads the browserName from properties.
                Initializes the WebDriver based on the browserName (Chrome or Firefox).
                Maximizes the browser window, deletes all cookies, and sets an implicit wait of 10 seconds.
                Navigates to the URL specified in the properties file.
     */
    @BeforeClass
    public static void initialization(){
        String browserName = prop.getProperty("browserName");
        if(browserName.equals("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
            driver= new ChromeDriver();
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);


        }
        else if(browserName.equals("FF")){

            //System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }


}