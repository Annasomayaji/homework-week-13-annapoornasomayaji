package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ThankYouPage extends Utility {

    //Elements
    By thankYouMessage = By.xpath("//div[@class='page-title']/h1");

    By orderSuccessfulMessage = By.xpath("//div[@class='section order-completed']/div[@class='title']");
    By continueButton=By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public String getThankYouMessageText(){
        return getTextFromElement(thankYouMessage);
    }
    public String getOrderSuccessfulMessageText(){
        return getTextFromElement(orderSuccessfulMessage);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }



}
