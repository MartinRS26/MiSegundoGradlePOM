package com.theinternetherokuapp.automation;

import com.theinternetherokuapp.automation.pageobjects.MessagePage;
import com.theinternetherokuapp.automation.steps.HomeStep;
import com.theinternetherokuapp.automation.steps.LoginStep;
import com.theinternetherokuapp.automation.steps.MessageStep;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;

public class TestAuthentication{

    @Steps
    HomeStep homeStep = new HomeStep();
    @Steps
    LoginStep loginStep =new LoginStep();
    @Steps
    MessageStep messageStep = new MessageStep();

    @Test
    public void authenticationHerokuapp() throws InterruptedException{
         homeStep.openBrowser();
         homeStep.clickFormAuthentication();
         loginStep.login();
         Thread.sleep(4000);
         messageStep.messageLogin();

     }

}
