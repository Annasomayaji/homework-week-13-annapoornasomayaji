package com.tutorialsninja.pages.desktops_and_products;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HP_LP3065Page extends Utility {
    //Elements
    By hP_LP3065P = By.xpath("//h1[normalize-space()='HP LP3065']");
    By deliveryDateDropDown = By.xpath("//div[@class='input-group date']/span");
    By monthAndYear = By.xpath("(//thead//th[@class='picker-switch'])[1]");
    By monthYearForwardArrow = By.xpath("(//thead//th[@class='picker-switch'])[1]/following-sibling::th");
    By allDatesOnCalender = By.xpath("//div[@class='datepicker-days']//td");
    By quantity = By.id("input-quantity");
    By addToCartButton = By.id("button-cart");
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    //Actions
    public String getHP_LP3065PHeadingText() {
        return getTextFromElement(hP_LP3065P);
    }

    public void clickOnDeliveryDateDropDown() {
        clickOnElement(deliveryDateDropDown);
    }

    public String getMonthAndYearFromCalender() {
        return getTextFromElement(monthAndYear);
    }

    public void clickOnMonthYearForwardArrow() {
        clickOnElement(monthYearForwardArrow);
    }

    public List<WebElement> getAllDates() {
        return getElements(allDatesOnCalender);
    }

    public void updateQuantity(String text) {
        getElement(quantity).click();
        sendTextToElement(quantity, "1");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getSuccessMessageText() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLinkInSuccessMessage(){
        clickOnElement(shoppingCartLink);
    }
}
