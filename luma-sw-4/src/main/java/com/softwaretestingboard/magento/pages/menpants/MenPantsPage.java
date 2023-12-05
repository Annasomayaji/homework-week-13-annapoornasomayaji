package com.softwaretestingboard.magento.pages.menpants;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPantsPage extends Utility {
    //Elements
    By cronusYogaPants=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By pantSize=By.id("option-label-size-143-item-175");
    By pantColour=By.id("option-label-color-93-item-49");
    By addToCArtButton=By.xpath("//button[@title='Add to Cart']");
    By getCronusYogaPantsLabel=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addedToCartMessage=By.xpath("//div[@class='message-success success message']");
    By shoppingCartLinkInMessage=By.linkText("shopping cart");
    //Actions
    public void mouseHoverOnCronusYogaPants(){
        moveMouseOnElement(cronusYogaPants);
    }

    public void mouseHoverAndClickOnSize(){
        moveMouseOnElementAndClick(pantSize);
    }

    public void mouseHoverAndClickOnColour(){
        moveMouseOnElementAndClick(pantColour);
    }

    public void clickOnAddToCartButton(){
        getElementBelow(addToCArtButton,getCronusYogaPantsLabel).click();
    }

    public String getSuccessfullyAddedToCartMessageText(){
        return getTextFromElement(addedToCartMessage);
    }

    public void  clickOnShoppingCartLinkInMessage(){
        clickOnElement(shoppingCartLinkInMessage);
    }



}
