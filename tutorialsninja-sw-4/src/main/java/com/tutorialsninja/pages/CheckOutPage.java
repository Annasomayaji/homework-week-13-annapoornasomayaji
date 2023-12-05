package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckOutPage extends Utility {

    //Elements
    By checkOutHeading = By.xpath("//div[@id='content']/h1");
    By newCustomerHeading = By.xpath("//h2[normalize-space()='New Customer']");
    By radioButton = By.xpath("//input[@name='account']");
    By continueButton = By.id("button-account");

    //Billing Details Elements

    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By email = By.id("input-payment-email");
    By phone = By.id("input-payment-telephone");
    By password = By.id("input-payment-password");
    By confirmPassword = By.id("input-payment-confirm");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postCode = By.id("input-payment-postcode");
    By countryDropDown = By.id("input-payment-country");
    By regionStateDropDown = By.id("input-payment-zone");

    By checkBox=By.xpath("//input[@name='agree']");
    By continueButtonBillingDetails=By.xpath("//div[@class='pull-right']/input[@value='Continue']");

    //Payment Method Elements
    By sendCommentsOnOrdersTextArea=By.xpath("//textarea[@name='comment']");
    By termsAndConditionsCheckBox=By.xpath("//input[@name='agree']");
    By continueButtonInPaymentMethod=By.id("button-payment-method");
    By paymentRequiredWarningMessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    //Actions
    public String getCheckOutHeadingText() {
        return getTextFromElement(checkOutHeading);
    }

    public String getNewCustomerHeadingText() {
        return getTextFromElement(newCustomerHeading);
    }

    public void clickOnRadioButton(String text) {
        List<WebElement> rButtons = getElements(radioButton);
        for (WebElement r : rButtons) {
            if (r.getText().equalsIgnoreCase(text)) {
                r.click();
                break;
            }
        }
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
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

    public void enterAddress(String text){
        sendTextToElement(address,text);
    }

    public void enterCity(String text){
        sendTextToElement(city,text);
    }

    public void enterPostCode(String text){
        sendTextToElement(postCode,text);
    }

    public void selectCountryFromDropDown(String text){
        selectOptionByVisibleTextFromDropDown(countryDropDown,text);
    }

    public void selectRegionOrStateFromDropDown(String text){
        selectOptionByVisibleTextFromDropDown(regionStateDropDown,text);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnContinueButtonInBillingDetails(){
        clickOnElement(continueButtonBillingDetails);
    }

    public void enterCommentsAboutOrder(String text){
        sendTextToElement(sendCommentsOnOrdersTextArea,text);
    }
    public void clickOnTermsAndConditionsCheckBox(){
        clickOnElement(termsAndConditionsCheckBox);
    }
    public void clickOnContinueButtonInPaymentMethod(){
        clickOnElement(continueButtonInPaymentMethod);
    }

    public String getWarningMessageText(){
        return getTextFromElement(paymentRequiredWarningMessage);
    }


}
