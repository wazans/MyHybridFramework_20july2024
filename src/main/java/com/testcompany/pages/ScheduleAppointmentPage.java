package com.testcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScheduleAppointmentPage {
    private WebDriver driver;
    private By appoint_icon= By.xpath("//*[@class='btn btn-default btn-lg button app big align-self-center'][5]");
    public ScheduleAppointmentPage(WebDriver driver)

    {
        this.driver=driver;
    }

    public void clickOnScheduleAppointment()
    {
        WebElement clickOnScheduleAppointment_field=driver.findElement(appoint_icon);
        clickOnScheduleAppointment_field.click();
    }
}
