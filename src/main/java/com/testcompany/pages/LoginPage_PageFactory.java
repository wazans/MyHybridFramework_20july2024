package com.testcompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
    // Declare WebElements with PageFactory annotations
    @FindBy(id = "username")
    private WebElement usernameField;

    //By username=By.id("username");

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "Inpatient Ward")
    private WebElement locationDropdown;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    // Constructor to initialize the PageFactory
    public LoginPage_PageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page elements
    public void enterUsername(String user) {
        usernameField.sendKeys(user);
    }

    public void enterPassword(String pwd) {
        passwordField.sendKeys(pwd);
    }

    public void selectLocation() {
        locationDropdown.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
