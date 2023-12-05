package com.tutorialsninja.pages.register_and_register_success;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterSuccessPage extends Utility {
    //Elements
    By registerSuccessMessage=By.xpath("//div[@id='content']/h1");
    By continueButton=By.linkText("Continue");


    //Actions
    public String getRegisterSuccessMessageText(){
        return getTextFromElement(registerSuccessMessage);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }


}
