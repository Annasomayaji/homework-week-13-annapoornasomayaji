package com.tutorialsninja.pages.account;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {
    //Elements
        By logoutHeading=By.xpath("//div[@id='content']/h1");
        By continueButton=By.linkText("Continue");


    //Actions
    public String getLogOutHeadingText(){
        return getTextFromElement(logoutHeading);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
