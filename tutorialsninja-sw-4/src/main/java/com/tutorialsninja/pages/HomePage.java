package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    //Elements
    By showAllOptions = By.xpath("//a[@class='see-all']");
    By deskTops = By.linkText("Desktops");
    By showAllDesktops=By.xpath("//a[normalize-space()='Show AllDesktops']");
    By showAllLaptopsAndNoteBooks=By.xpath("//a[contains(text(),'AllLaptops & Notebooks')]");
    By lapTopsAndNoteBooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By currencyDropDown=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    By currencyList=By.xpath("//ul[@class='dropdown-menu']/li/button");

    By myAccountLink=By.xpath("//a[@title='My Account']");
    By myAccountOptions=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");



    //Actions

    public List<WebElement> showAllOptionsFromTopNav() {
        return getElements(showAllOptions);
    }

    public void mouseHoverAndClickOnDesktops() {
        moveMouseOnElementAndClick(deskTops);
    }

    public void mouseHoverAndClickOnShowAllDesktops(){
        moveMouseOnElementAndClick(showAllDesktops);
    }
    public void mouseHoverAndClickOnLapTopsAndNoteBooks() {
        moveMouseOnElementAndClick(lapTopsAndNoteBooks);
    }

    public void moveMouseAndClickOnComponents(){
        moveMouseOnElementAndClick(components);
    }

    public void moveMouseAndClickOnCurrencyDropDown(){
        moveMouseOnElementAndClick(currencyDropDown);
    }

    public List<WebElement> getCurrencyListFromDropDown(){
        return getElements(currencyList);
    }

    public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNoteBooks);
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }

    public List<WebElement> getMyAccountOptions(){
        return getElements(myAccountOptions);
    }

}
