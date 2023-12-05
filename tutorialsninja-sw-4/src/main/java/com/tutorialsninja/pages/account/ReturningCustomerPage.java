package com.tutorialsninja.pages.account;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ReturningCustomerPage extends Utility {
    //Elements
    By email=By.id("input-email");
    By password=By.id("input-password");
    By loginButton=By.xpath("//input[@value='Login']");



    //Actions
    public void enterEmail(String text){
        sendTextToElement(email,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

}
