package com.testcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    // The driver variable is declared as private to ensure it is only accessible within the LoginPage class.
    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By location = By.id("Inpatient Ward");
    private By loginButton = By.id("loginButton");

    // The constructor takes a WebDriver instance as a parameter and assigns it to the class's private driver variable.
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String user) {
        WebElement usernameField = driver.findElement(username);
        usernameField.sendKeys(user);
    }

    public void enterPassword(String pwd) {
        WebElement passwordField = driver.findElement(password);
        passwordField.sendKeys(pwd);
    }

    public void selectLocation() {
        WebElement locationDropdown = driver.findElement(location);
        locationDropdown.click();
    }

    public void clickLoginButton() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }
}
