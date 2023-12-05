package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketsPage extends Utility {
    //Elements
    By jacketProductsByName=By.xpath("//strong[@class='product name product-item-name']");
    By jacketProductsByPrice=By.xpath("//span[@class='price-container price-final_price tax weee']//span[@class='price']");
    By sortByFilter=By.id("sorter");

    //Actions
    public List<WebElement> getFilteredProductListByProductName(){
        return getElements(jacketProductsByName);
    }
    public void selectFromSortByDropDown(String text){
        selectOptionByVisibleTextFromDropDown(sortByFilter,text);
    }

    public List<WebElement> getFilteredProductListByPrice(){
        return getElements(jacketProductsByPrice);
    }

}
