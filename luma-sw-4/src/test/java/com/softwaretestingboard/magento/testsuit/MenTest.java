package com.softwaretestingboard.magento.testsuit;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.pages.menpants.MenPantsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPantsPage menPantsPage = new MenPantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // * Mouse Hover on Men Menu
        homePage.mouseHoverOnMenLink();

        // * Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();

        // * Click on Pants
        homePage.mouseHoverAndClickOnPants();


        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPantsPage.mouseHoverAndClickOnSize();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPantsPage.mouseHoverAndClickOnColour();


        // * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPantsPage.clickOnAddToCartButton();

        // * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPantsPage.getSuccessfullyAddedToCartMessageText(), "You added Cronus Yoga Pant to your shopping cart.", "Product not added successfully");

        //* Click on ‘shopping cart’ Link into message
        menPantsPage.clickOnShoppingCartLinkInMessage();

        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getShoppingCartHeadingText(), "Shopping Cart", "Navigated to wrong page");

        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getProductNameText(), "Cronus Yoga Pant", "Wrong product name.");

        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.getProductSizeText(), "32", "wrong product size");

        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getProductColourText(), "Black", "Wrong product colour.");

    }


}
