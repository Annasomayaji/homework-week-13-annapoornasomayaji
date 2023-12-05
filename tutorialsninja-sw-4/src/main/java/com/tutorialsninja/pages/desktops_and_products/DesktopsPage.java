package com.tutorialsninja.pages.desktops_and_products;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {
    //Elements
    By desktopPageTitle = By.xpath("//div[@id='content']/h2");

    By productsList = By.xpath("//div[@class='row']//div[@class='product-thumb']");
    By sortByDropDown=By.id("input-sort");

    By hP_LP3065=By.xpath("//a[text()='HP LP3065']");


    //Actions
    public String getDeskTopTitleText() {
        return getTextFromElement(desktopPageTitle);
    }

    public List<WebElement> getFilteredProductList(){
        return getElements(productsList);
    }

    public void selectSortByName(String text){
        selectOptionByVisibleTextFromDropDown(sortByDropDown,text);
    }

    public void clickOnHP_LP3065(){
        clickOnElement(hP_LP3065);
    }



}
