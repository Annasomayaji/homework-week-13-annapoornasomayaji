package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {
    //sort by drop down
    By sortByDropDown=By.id("products-orderby");
    By filteredProductsResult=By.xpath("//div[@class='details']//h2[@class='product-title']/a");

    By buildYourOwnComputer= By.xpath("//h1[normalize-space()='Build your own computer']");

    By addToCartButton =By.xpath("(//div[@class='buttons']/button[text()='Add to cart'])[1]");
    public void selectDropDownByVisibleText(String str){
        selectByVisibleTextFromDropDown(sortByDropDown,str);
    }


    public List<WebElement> getFilteredProductsList(){
        return getElements(filteredProductsResult);
    }

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCartButton);
    }


}
