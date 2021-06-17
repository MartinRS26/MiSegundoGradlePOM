package com.theinternetherokuapp.automation.steps;

import com.theinternetherokuapp.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    LoginPage loginStep = new LoginPage();
    @Step
    public void login(){
        loginStep.setUserName();
        loginStep.setPassword();
        loginStep.clickLoginButton();
    }
}
