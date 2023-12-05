package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utility {
    //Elements
    By registrationCompleteMessage = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//a[text()='Continue']");

    //Actions

    public String getRegistrationCompleteMessageText() {
        return getTextFromElement(registrationCompleteMessage);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}
