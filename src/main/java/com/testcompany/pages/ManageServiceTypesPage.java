package com.testcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageServiceTypesPage {
    private WebDriver driver;
    private By manage_service_icon=By.xpath("//a[@id='appointmentschedulingui-manageAppointmentTypes-app']//i[@class='icon-calendar']");
    private By edit_icon=By.id("appointmentschedulingui-edit-Infectious Disease");
    private By Description=By.xpath("//textarea[@id='description-field']");

    public ManageServiceTypesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void ManageServiceType_click()
    {
        WebElement manage_service_icon_click=driver.findElement(manage_service_icon);
        manage_service_icon_click.click();
        WebElement edit_random_icon=driver.findElement(edit_icon);
        edit_random_icon.click();
        WebElement description_field=driver.findElement(Description);
        description_field.click();
        description_field.sendKeys("description test");

    }


}
