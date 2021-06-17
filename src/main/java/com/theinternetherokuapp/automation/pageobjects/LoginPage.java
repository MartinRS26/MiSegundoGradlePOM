package com.theinternetherokuapp.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By userName = By.name("username");
    By password = By.id("password");
    By LoginButton = By.xpath("//button[@type='submit']");
    public void setUserName(){
        getDriver().findElement(userName).sendKeys("tomsmith");
    }
    public  void setPassword(){
        getDriver().findElement(password).sendKeys("SuperSecretPassword!");
    }
    public void clickLoginButton(){
        getDriver().findElement(LoginButton).click();
    }
}
