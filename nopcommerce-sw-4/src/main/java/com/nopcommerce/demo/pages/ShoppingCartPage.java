package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    //Elements
    By pageTitle=By.xpath("//div[@class='page-title']");
    By quantityTextBox= By.xpath("//td[@class= 'quantity']//input");
    By updateShoppingCartButton=By.id("updatecart");
    By total= By.xpath("(//td[@class='cart-total-right']/span[@class=\"value-summary\"])[4]");
    By termsOfServiceCheckBox=By.id("termsofservice");
    By checkOutButton=By.id("checkout");



    //Actions
    public String getTextFromPageTitle(){
        return getTextFromElement(pageTitle);
    }

    public void sendTextToQuantityTextBox(String text){
        getElement(quantityTextBox).clear();
        sendTextToElement(quantityTextBox, text);
    }

    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }

    public String getTextFromTotal(){
        return getTextFromElement(total);
    }

    public void clickOnTermsOfServiceCheckBox(){
     if(!getElement(termsOfServiceCheckBox).isSelected())
        clickOnElement(termsOfServiceCheckBox);
    }

    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    //get Quantity by value attribute
    public String getQuantityText(){
       return getAttributeByValue(quantityTextBox);

    }


}
