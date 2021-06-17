package com.theinternetherokuapp.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {
    By messageLogin = By.id("flash");

    public String messageLogin(){
        return getDriver().findElement(messageLogin).getText().replace("\n", "").substring(0,30);
    }
}
