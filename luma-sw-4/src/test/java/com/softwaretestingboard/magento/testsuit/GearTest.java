package com.softwaretestingboard.magento.testsuit;

import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.pages.gears.GearsBagsPage;
import com.softwaretestingboard.magento.pages.gears.GearPages;
import com.softwaretestingboard.magento.pages.gears.OverNightDufflePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPages gearPages=new GearPages();
    GearsBagsPage gearsBagsPage=new GearsBagsPage();
    OverNightDufflePage overNightDufflePage=new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        // * Mouse Hover on Gear Menu
        gearPages.mouseHoverOnGearLink();

        // * Click on Bags
        gearPages.mouseHoverAndClickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        gearsBagsPage.clickOnOverNightDuffle();

        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(overNightDufflePage.getPageTitleText(),"Overnight Duffle","Worng product is displayed.");

        //* Change Qty 3
        overNightDufflePage.updateQuantity("3");

        //* Click on ‘Add to Cart’ Button.
        overNightDufflePage.clickOnAddToCartButton();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overNightDufflePage.getAddedToCartSuccessfullyMessageText(),"You added Overnight Duffle to your shopping cart.","Success message displayed incorrectly.");

        //* Click on ‘shopping cart’ Link into message
        overNightDufflePage.clickOnShoppingCartLinkInMessage();

        //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleHeadingText(),"Overnight Duffle","Wrong product displayed.");

        //* Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.getQuantityText(),"3","Incorrect product number");

        //* Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.getTotalPriceText(),"$135.00","Incorrect total");

        //* Change Qty to ‘5’
        shoppingCartPage.updateQuantity("5");

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();

        //add explicit wait
        shoppingCartPage.waitUntilShoppingCartUpdated(5);

        //* Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.getTotalPriceText(),"$135.00","Incorrect total");



    }


}
