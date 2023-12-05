package com.softwaretestingboard.magento.testsuit;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage=new HomePage();
    WomenJacketsPage womenJacketsPage=new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        // * Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenLink();

        // * Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        // * Click on Jackets
        homePage.mouseHoverAndClickOnJackets();

        //Before filter
        List<WebElement> beforeFilter = womenJacketsPage.getFilteredProductListByProductName();
        List<String> beforeFilterList = new ArrayList<>();
        for (WebElement e : beforeFilter) {
            beforeFilterList.add(e.getText());
        }
        Collections.sort(beforeFilterList);//a-z

        //* Select Sort By filter “Product Name”
        womenJacketsPage.selectFromSortByDropDown("Product Name");

        //* Verify the products name display in alphabetical order
        List<WebElement> afterFilter = womenJacketsPage.getFilteredProductListByProductName();
        List<String> afterFilterList = new ArrayList<>();
        for (WebElement e : afterFilter) {
            afterFilterList.add(e.getText());
        }

        Assert.assertEquals(afterFilterList,beforeFilterList,"The products are not displayed alphabetically.");
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        // * Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenLink();

        // * Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        // * Click on Jackets
        homePage.mouseHoverAndClickOnJackets();

        //* Select Sort By filter “Price”
        //Before filter
        List<WebElement> beforeFilter = womenJacketsPage.getFilteredProductListByPrice();
        List<Double> beforeFilterList = new ArrayList<>();
        for (WebElement e : beforeFilter) {
            beforeFilterList.add(Double.valueOf(e.getText().replace("$","")));
        }
        System.out.println("Price"+ beforeFilterList);//for debug purpose
        Collections.sort(beforeFilterList);


        //* Select Sort By filter “Price”
        womenJacketsPage.selectFromSortByDropDown("Price");

        //* Verify the products price display in Low to High
        List<WebElement> afterFilter = womenJacketsPage.getFilteredProductListByPrice();
        List<Double> afterFilterList = new ArrayList<>();
        for (WebElement e : afterFilter) {
            afterFilterList.add(Double.valueOf(e.getText().replace("$","")));
        }

        Assert.assertEquals(afterFilterList,beforeFilterList,"The products are not displayed in price order.");

    }

}
