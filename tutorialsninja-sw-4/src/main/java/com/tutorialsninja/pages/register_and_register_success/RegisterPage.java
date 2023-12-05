package com.tutorialsninja.pages.register_and_register_success;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Utility {
    //Elements
    By registerPageHeading = By.xpath("//div[@id='content']/h1");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By newLetterRadioButtons= By.xpath("//input[@name='newsletter']");
    By privacyPolicyCheckBox=By.xpath("//input[@name='agree']");
    By continueButton=By.xpath("//input[@value='Continue']");



    //Actions
    public String getRegisterPageHeadingText() {
        return getTextFromElement(registerPageHeading);
    }
    public void enterFirstName(String text){
        sendTextToElement(firstName,text);
    }
    public void enterLastName(String text){
        sendTextToElement(lastName,text);
    }
    public void enterEmail(String text){
        sendTextToElement(email,text);
    }

    public void enterPhone(String text){
        sendTextToElement(phone,text);
    }

    public void enterPassword(String text){
        sendTextToElement(password,text);
    }

    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPassword,text);
    }

    public void clickOnNewsLetterRadioButton(String text){
        List<WebElement> radioButton = getElements(newLetterRadioButtons);
        for (WebElement r : radioButton) {
            if (r.getText().equalsIgnoreCase(text)) {
                r.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
