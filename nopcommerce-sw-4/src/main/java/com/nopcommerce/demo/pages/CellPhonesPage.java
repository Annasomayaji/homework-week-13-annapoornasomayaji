package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CellPhonesPage extends Utility {
    //Elements
    By cellPhonePageTitle = By.xpath("//div[@class='page-title']/h1");

    By listView = By.xpath("//a[@title='List']");

    By nokiaLumia = By.linkText("Nokia Lumia 1020");

    By productName=By.xpath("//div[@class='product-name']/h1");

    By productPrice=By.id("price-value-20");

    By quantity=By.id("product_enteredQuantity_20");

    By addToCartButton=By.id("add-to-cart-button-20");

    By productAddedMessage= By.xpath("//p[@class='content']");

    By closeButtonOnProductAddedMessage=By.xpath("//span[@class='close']");

    By goToCartButton=By.xpath("//button[text()='Go to cart']");

    By shoppingCartLabel= By.xpath("//span[@class='cart-label']");

    // Actions
    public String getCellPhonesText() {
        return getTextFromElement(cellPhonePageTitle);
    }

    public void clickOnListView() {
        clickOnElement(listView);
    }

    public void clickOnNokiaLumia() {
        clickOnElement(nokiaLumia);
    }

    public String getProductNameText(){
         return getTextFromElement(productName);
    }

    public String getProductPriceText(){
        return getTextFromElement(productPrice);
    }

    public void changeQuantity(String str){

        getElement(quantity).clear();
        sendTextToElement(quantity, str);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getProductAddedMessageText(){
        return getTextFromElement(productAddedMessage);
    }

    public void clickOnCloseButton(){
        clickOnElement(closeButtonOnProductAddedMessage);
    }

    public void mouseHoverOnShoppingCart(){
        moveMouseOnElement(shoppingCartLabel);
    }

    public WebElement waitExplicitlyForGoToCartButtonToBeVisible(int time){
        return waitUntilVisibilityOfElementLocated( goToCartButton, time);
    }
    public void clickOnGoToCartButton(){
        moveMouseOnElementAndClick(goToCartButton);
    }


}
