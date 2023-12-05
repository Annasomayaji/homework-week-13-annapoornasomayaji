package com.tutorialsninja.pages.account;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    //Elements
    By myAccountHeading=By.xpath("//div[@id='content']/h2[text()='My Account']");

    //Actions

    public String getMyAccountHeadingText(){
        return getTextFromElement(myAccountHeading);
    }

}
