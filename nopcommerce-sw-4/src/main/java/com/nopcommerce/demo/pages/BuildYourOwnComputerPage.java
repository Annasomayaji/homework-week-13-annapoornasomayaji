package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuildYourOwnComputerPage extends Utility {

    //Elements
    By pageHeading = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processor=By.id("product_attribute_1");
    By ram= By.id("product_attribute_2");
    By hddRadioButton = By.id("product_attribute_3_7");

    By osRadioButton=By.id("product_attribute_4_9");
    By msOfficeCheckBox=By.id("product_attribute_5_10");
    By totalCommanderCheckBox=By.id("product_attribute_5_12");

    By totalPrice= By.id("price-value-1");
    By addToCartButton= By.id("add-to-cart-button-1");

    By productIsAddedMessage= By.xpath("//p[@class='content']");

    By closeMessageBar=By.xpath("//span[@class='close']");

    By shoppingCartLink= By.id("topcartlink");

    By goToCartButton= By.xpath("//button[normalize-space()='Go to cart']");

    //Actions on elements
    public String getPageHeading(){
        return getTextFromElement(pageHeading);
    }

    public void selectProcessorDropDownByVisibleText(String str){
        selectByVisibleTextFromDropDown(processor,str);
    }

    public void selectRamDropDownByVisibleText(String str){
        selectByVisibleTextFromDropDown(ram,str);
    }

    public void clickOnHddRadioButton(){
        clickOnElement(hddRadioButton);
    }

    public void clickOnOsRadioButton(){
        clickOnElement(osRadioButton);
    }

    public boolean isMSOfficeCheckBoxSelected(){
        return getElement(msOfficeCheckBox).isSelected();
    }

    public void clickOnMSOfficeCheckBox(){
        clickOnElement(msOfficeCheckBox);
    }
    public void clickOnTotalCommanderCheckBox(){
        clickOnElement(totalCommanderCheckBox);
    }

    public String getTotalPrice(){
        return getTextFromElement(totalPrice);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getProductAddedToCartMessage(){
       return getTextFromElement(productIsAddedMessage);
    }

    public void clickOnCloseMessageBar(){
        clickOnElement(closeMessageBar);
    }

//    public WebElement getGoToCartButton(){
//        return getElement(goToCartButton);
//    }

    public WebElement waitExplicitlyForGoToCartButtonToBeVisible(int time){
        return waitUntilVisibilityOfElementLocated( goToCartButton, time);
    }

    public void mouseHoverOnShoppingCartLink(){
        moveMouseOnElement(shoppingCartLink);
    }

    public void mouseHoverAndClickGoToCartButton(){
        moveMouseOnElementAndClick(goToCartButton);
    }
}
