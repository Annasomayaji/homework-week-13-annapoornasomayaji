package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    //Elements
    By welcomeHeading = By.xpath("//div[@class='page-title']/h1");
    By checkOutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");

    By registerButton=By.xpath("//button[normalize-space()='Register']");
    //Actions
    public String getWelcomeMessageFromHeading() {
        return getTextFromElement(welcomeHeading);
    }

        public void clickOnCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
}
