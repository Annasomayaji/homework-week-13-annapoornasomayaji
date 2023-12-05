package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    //Elements
    By shoppingCartHeading = By.xpath("//div[@class='page-title-wrapper']/h1");

    By productName = By.linkText("Cronus Yoga Pant");
    By productSize = By.xpath("//dl[@class='item-options']//dd[1]");
    By productColour = By.xpath("//dl[@class='item-options']//dd[2]");
    By overNightDuffleHeading = By.linkText("Overnight Duffle");

    By quantity = By.xpath("//span[@class='label'][text()='Qty']/following-sibling::input");

    By totalPrice = By.xpath("(//span[@class='cart-price']/span[@class='price'])[2]");
    By updateShoppingCartButton=By.xpath("//button[normalize-space()='Update Shopping Cart']");

    //Actions
    public String getShoppingCartHeadingText() {
        return getTextFromElement(shoppingCartHeading);
    }

    public String getProductNameText() {
        return getTextFromElement(productName);
    }

    public String getProductSizeText() {
        return getTextFromElement(productSize);
    }

    public String getProductColourText() {
        return getTextFromElement(productColour);
    }

    public String getOverNightDuffleHeadingText() {
        return getTextFromElement(overNightDuffleHeading);
    }

    public String getQuantityText() {
        return getAttributeByValue(quantity);
    }

    public void updateQuantity(String text){
        getElement(quantity).clear();
        sendTextToElement(quantity,text);
    }
    public String getTotalPriceText() {
        return getTextFromElement(totalPrice);
    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCartButton);
    }

    public WebElement waitUntilShoppingCartUpdated(int time){
        return waitUntilVisibilityOfElementLocated(totalPrice,time);
    }
}
