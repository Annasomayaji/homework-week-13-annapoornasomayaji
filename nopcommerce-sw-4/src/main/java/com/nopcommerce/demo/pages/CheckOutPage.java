package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends Utility {
    //Elements
    By firstNameTextField = By.id("BillingNewAddress_FirstName");
    By lastNameTextField = By.id("BillingNewAddress_LastName");

    By emailTextField = By.id("BillingNewAddress_Email");
    By countryDropDown = By.id("BillingNewAddress_CountryId");
    By cityTextField = By.id("BillingNewAddress_City");
    By billingAddressTextField = By.id("BillingNewAddress_Address1");

    By zipOrPostalCodeTextField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextField = By.id("BillingNewAddress_PhoneNumber");
    By continueButtonShippingAddress = By.name("save");

    By nextDayAirRadioButton = By.id("shippingoption_1");
    By secondDayRadioButton=By.xpath("//input[@id='shippingoption_2']");
    By continueButtonShippingMethod = By.xpath("//div[@id='shipping-method-buttons-container']/button[normalize-space()='Continue']");

    By creditCardRadioButton = By.id("paymentmethod_1");
    By continueButtonPaymentMethod = By.xpath("//div[@id='payment-method-buttons-container']//button[normalize-space()='Continue']");
    By selectCreditCardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");

    By expiryMonth = By.id("ExpireMonth");
    By expiryYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButtonPaymentInfo = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethod = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");

    By total = By.xpath("//td[@class='cart-total-right']/span[@class='value-summary']/strong");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    By confirmPaymentMethod= By.xpath("//span[normalize-space()='Credit Card']");
    //By confirmShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By confirmShippingMethod = By.xpath("(//span[contains(normalize-space(),'Day Air')])[1]");
    By confirmTotal = By.xpath("//td[@class='cart-total-right']/span[@class='value-summary']/strong");

    By confirmOrderButton = By.xpath("//button[normalize-space()='Confirm']");




    //Actions

    public void enterFirstName(String text) {
        sendTextToElement(firstNameTextField, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastNameTextField, text);
    }

    public void enterRandomEmail(String email) {
        sendTextToElement(emailTextField, email);
    }

    public void selectCountry(String text) {
        selectByVisibleTextFromDropDown(countryDropDown, text);
    }

    public void enterCity(String text) {
        sendTextToElement(cityTextField, text);
    }

    public void enterAddressLine1(String text) {
        sendTextToElement(billingAddressTextField, text);
    }

    public void enterZipOrPostalCode(String text) {
        sendTextToElement(zipOrPostalCodeTextField, text);
    }

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumberTextField, text);
    }

    public void clickOnContinueButtonShippingAddress() {
        clickOnElement(continueButtonShippingAddress);
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnSecondDayAirRadioButton(){
        clickOnElement(secondDayRadioButton);
    }
    public void continueButtonShippingMethod() {
        clickOnElement(continueButtonShippingMethod);
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButtonPaymentMethod() {
        clickOnElement(continueButtonPaymentMethod);
    }

    public void selectCreditCardDropDown(String text) {
        selectByVisibleTextFromDropDown(selectCreditCardDropDown, text);
    }

    public void enterCardHolderName(String text) {
        sendTextToElement(cardHolderName, text);
    }

    public void enterCardNumber(String text) {
        sendTextToElement(cardNumber, text);
    }

    public void selectExpiryMonthDropDown(String text) {
        selectByVisibleTextFromDropDown(expiryMonth, text);
    }

    public void selectExpiryYearDropDown(String text) {
        selectByVisibleTextFromDropDown(expiryYear, text);
    }

    public void enterCardCode(String text) {
        sendTextToElement(cardCode, text);
    }

    public void clickOnContinueButtonPaymentInfo() {
        clickOnElement(continueButtonPaymentInfo);
    }

    public String getTextFromPaymentMethod(){
        return getTextFromElement(confirmPaymentMethod);
    }

    public String getTextFromShippingMethod(){
        return getTextFromElement(confirmShippingMethod);
    }

    public String getTextFromTotal(){
        return getTextFromElement(confirmTotal);
    }

    public WebElement waitExplicitlyBeforeConfirm(int time){
        return waitUntilVisibilityOfElementLocated(confirmButton,time);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
}
