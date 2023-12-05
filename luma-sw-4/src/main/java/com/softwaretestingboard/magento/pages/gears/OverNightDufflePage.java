package com.softwaretestingboard.magento.pages.gears;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {
    //Elements
    By pageTitle= By.xpath("//h1[@class='page-title']");
    By quantity=By.id("qty");
    By addToCartButton=By.id("product-addtocart-button");
    By addToShoppingCartSuccessMessage=By.xpath("//div[@class='message-success success message']");
    By shoppingCartLinkInMessage=By.linkText("shopping cart");
    //Actions
    public String getPageTitleText(){
        return getTextFromElement(pageTitle);
    }

    public void updateQuantity(String text){
        getElement(quantity).clear();
        sendTextToElement(quantity,text);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartSuccessfullyMessageText(){
        return getTextFromElement(addToShoppingCartSuccessMessage);
    }

    public void  clickOnShoppingCartLinkInMessage(){
        clickOnElement(shoppingCartLinkInMessage);
    }

}
