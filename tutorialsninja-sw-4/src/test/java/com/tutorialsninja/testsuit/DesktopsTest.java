package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.pages.desktops_and_products.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.desktops_and_products.HP_LP3065Page;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HP_LP3065Page hpLp3065Page = new HP_LP3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverAndClickOnDesktops();

        //1.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();

        //Store all products in a list and sort them in descending order using Collections Before filter
        List<WebElement> productsBeforeFilter = desktopsPage.getFilteredProductList(); //Utility method
        ArrayList<String> productsListBeforeFilter = new ArrayList<>();
        for (WebElement product : productsBeforeFilter) {
            productsListBeforeFilter.add(product.getText());
        }
        Collections.sort(productsListBeforeFilter, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(productsListBeforeFilter);

        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectSortByName("Name (Z - A)");

        //1.4 Verify the Product will arrange in Descending order.
        List<WebElement> productsAfterFilter = desktopsPage.getFilteredProductList();
        List<String> productsListAfterFilter = new ArrayList<>();
        for (WebElement product : productsAfterFilter) {
            productsListAfterFilter.add(product.getText());
        }

        //1.4 Verify the Product will arrange in Descending order
        Assert.assertEquals(productsListAfterFilter, productsListBeforeFilter, "Products not arranged in descending order.");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.moveMouseAndClickOnCurrencyDropDown();

        //2.2 Mouse hover on £Pound Sterling and click
        List<WebElement> allCurrencies = homePage.getCurrencyListFromDropDown();
        for (WebElement element : allCurrencies) {
            if (element.getText().equalsIgnoreCase("£Pound Sterling")) {
                element.click();
                break;
            }
        }

        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHoverAndClickOnDesktops();

        //2.4 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();

        //2.5 Select Sort By position "Name: A to Z"
        desktopsPage.selectSortByName("Name (A - Z)");

        //2.6 Select product “HP LP3065”
        desktopsPage.clickOnHP_LP3065();

        //2.7 Verify the Text "HP LP3065"
        Assert.assertEquals(hpLp3065Page.getHP_LP3065PHeadingText(), "HP LP3065", "Wrong product name displayed.");

        //2.8 Select Delivery Date "2023-11-27"
        hpLp3065Page.clickOnDeliveryDateDropDown();
        String mon = "November";
        String yer = "2023";
        String dt = "27";
        while (true) {
            String monthYear = hpLp3065Page.getMonthAndYearFromCalender();
            String[] monthYearArray = monthYear.split(" ");
            String month = monthYearArray[0];
            String year = monthYearArray[1];
            if (month.equalsIgnoreCase(mon) && year.equalsIgnoreCase(yer)) {
                break;
            } else {
                hpLp3065Page.clickOnMonthYearForwardArrow();
            }
        }

        //select date
        List<WebElement> allDates = hpLp3065Page.getAllDates();
        for (WebElement date : allDates) {
            if (date.getText().equals(dt)) {
                date.click();
                break;
            }
        }

        //2.9.Enter Qty "1” using Select class.
        hpLp3065Page.updateQuantity("1");

        //2.10 Click on “Add to Cart” button
        hpLp3065Page.clickOnAddToCartButton();

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertTrue(hpLp3065Page.getSuccessMessageText().contains("Success: You have added HP LP3065 to your shopping cart!"), "Success message is not displayed correctly.");

        //2.12 Click on link “shopping cart” display into success message
        hpLp3065Page.clickOnShoppingCartLinkInSuccessMessage();

        //2.13 Verify the text "Shopping Cart"
        Assert.assertTrue(shoppingCartPage.getShoppingCartHeadingText().contains("Shopping Cart"));

        //2.14 Verify the Product name "HP LP3065"
        Assert.assertEquals(shoppingCartPage.getProductNameHP_LP3065Text(), "HP LP3065", "Wrong product name displayed.");

        //2.15 Verify the Delivery Date "2023-11-27"
        Assert.assertEquals(shoppingCartPage.getDeliveryDate(), "Delivery Date:2023-11-27", "Wrong delivery date");

        //2.16 Verify the Model "Product21"
        Assert.assertEquals(shoppingCartPage.getModelNameText(), "Product21", "Incorrect product name.");

        //2.17 Verify the Total "£74.73"
        Assert.assertEquals(shoppingCartPage.getTotalText(), "£74.73", "Incorrect total.");
    }


}
