package com.tutorialsninja.pages.laptops_notebooks_and_products;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LapTopsAndNoteBooksPage extends Utility {

    //Elements
    By lapTopsAndNoteBooksPageTitle = By.xpath("//div[@id='content']/h2");
    By productsList = By.xpath("//p[@class='price']");
    By sortByDropDown = By.id("input-sort");
    By macBook = By.linkText("MacBook");

    //Actions
    public String getLapTopsAndNoteBooksTitleText() {
        return getTextFromElement(lapTopsAndNoteBooksPageTitle);
    }

    public List<WebElement> getFilteredProductList() {
        return getElements(productsList);
    }

    public void selectFromSortByFilter(String text) {
        selectOptionByVisibleTextFromDropDown(sortByDropDown, text);
    }

    public void clickOnMacBook(){
        clickOnElement(macBook);
    }

}
