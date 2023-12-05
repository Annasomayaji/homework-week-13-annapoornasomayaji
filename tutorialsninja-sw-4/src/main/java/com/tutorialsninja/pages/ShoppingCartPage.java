package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ShoppingCartPage extends Utility {
    //Elements
    By shoppingCartHeading = By.xpath("//div[@id='content']/h1");
    By productNameHP_LP3065 = By.linkText("HP LP3065");
    By getProductNameMacBook = By.linkText("MacBook");
    By deliveryDate = By.xpath("//tbody/tr/td[2]/small");
    By modelNameRelativeWith = By.xpath("//td[@class='text-left']");
    By modelLabel = By.xpath("//td[@class='text-left'][text()='Model']");
    By total = By.xpath("//tbody/tr/td[6]");

    By quantityRelativeWith=By.xpath("//input[@class='form-control']");
    By quantityLabel=By.xpath("//td[text()='Quantity']");
    By updateTab=By.xpath("//button[@class='btn btn-primary']");
    By cartUpdateSuccessMessage=By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By checkOutButton=By.linkText("Checkout");

    //Actions
    public String getShoppingCartHeadingText() {
        return getTextFromElement(shoppingCartHeading);
    }

    public String getProductNameHP_LP3065Text() {
        return getTextFromElement(productNameHP_LP3065);
    }

    public String getProductNameMacBookText() {
        return getTextFromElement(getProductNameMacBook);
    }


    public String getDeliveryDate() {
        return getElementBelow(deliveryDate, productNameHP_LP3065).getText();
    }

    public String getModelNameText() {
        return getElementBelow(modelNameRelativeWith, modelLabel).getText();
    }

    public String getTotalText() {
        return getTextFromElement(total);
    }

    public void updateQuantity(String text){
       getElementBelow(quantityRelativeWith,quantityLabel).clear();
       driver.findElement(RelativeLocator.with(quantityRelativeWith).below(quantityLabel)).sendKeys(text);
    }
    public void clickOnUpdateTab(){
        clickOnElement(updateTab);
    }

    public String getUpdateSuccessMessageText(){
        return getTextFromElement(cartUpdateSuccessMessage);
    }

    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
}
