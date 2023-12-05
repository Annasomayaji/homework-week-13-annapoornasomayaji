package com.tutorialsninja.pages.account;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //Elements
    By returningCustomerHeading=By.xpath("//h2[text()='Returning Customer']");

    //Actions
    public String getReturningCustomerHeadingText(){
        return getTextFromElement(returningCustomerHeading);
    }


}
