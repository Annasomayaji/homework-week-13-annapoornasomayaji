package com.tutorialsninja.pages.laptops_notebooks_and_products;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {
    //Elements

    By macBook= By.xpath("//div[@class='col-sm-4']/h1");
    By addToCArtButton=By.id("button-cart");
    By successMessage=By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink=By.xpath("//a[normalize-space()='shopping cart']");

    //Actions

    public String getMacBookHeadingText(){
        return getTextFromElement(macBook);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCArtButton);
    }

    public String getSuccessMessageText(){
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLinkInSuccessMessage(){
        clickOnElement(shoppingCartLink);
    }

}
