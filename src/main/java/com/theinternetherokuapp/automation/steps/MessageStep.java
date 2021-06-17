package com.theinternetherokuapp.automation.steps;

import com.theinternetherokuapp.automation.pageobjects.MessagePage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class MessageStep {

    MessagePage messagePage = new MessagePage();

    @Step
    public void messageLogin(){
        Assertions.assertEquals("You logged into a secure area!", messagePage.messageLogin());
        System.out.println(messagePage.messageLogin());
    }
}
