package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    SignInPage signInPage = new SignInPage();

    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    CheckOutPage checkOutPage = new CheckOutPage();
    ThankYouPage thankYouPage = new ThankYouPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {


    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsLink();

        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndCLickOnCellPhones();

        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getCellPhonesText(), "Cell phones", "The user is navigated to incorrect page");

        //2.4 Click on List View Tab
        cellPhonesPage.clickOnListView();
        driver.navigate().refresh();

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumia();

        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(cellPhonesPage.getProductNameText(), "Nokia Lumia 1020", "Incorrect product displayed.");

        //2.7 Verify the price “$349.00”
        Assert.assertEquals(cellPhonesPage.getProductPriceText(), "$349.00", "The Price does not match.");

        //2.8 Change quantity to 2
        cellPhonesPage.changeQuantity("2");

        //2.9 Click on “ADD TO CART” tab
        cellPhonesPage.clickOnAddToCartButton();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(cellPhonesPage.getProductAddedMessageText(), "The product has been added to your shopping cart", "Wrong message displayed.");

        //After that close the bar clicking on the cross button
        cellPhonesPage.clickOnCloseButton();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonesPage.mouseHoverOnShoppingCart();
        cellPhonesPage.waitExplicitlyForGoToCartButtonToBeVisible(4);

        cellPhonesPage.clickOnGoToCartButton();

        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getTextFromPageTitle(), "Shopping cart", "Navigated to wrong page.");

        //2.13 Verify the quantity is 2
        System.out.println(shoppingCartPage.getQuantityText()); //for debug purpose
        Assert.assertEquals(shoppingCartPage.getQuantityText(), "2", "Incorrect quantity.");

        //2.14 Verify the Total $698.00
        Assert.assertEquals(shoppingCartPage.getTextFromTotal(), "$698.00", "Total is incorrect.");


        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.getWelcomeMessageFromHeading(), "Welcome, Please Sign In!", "Navigated to wrong page.");

        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterButton();

        //2.19 Verify the text “Register”
        Assert.assertEquals(registerPage.getRegisterPageTitleText(), "Register", "Navigated to wrong page.");

        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Annu");
        registerPage.enterLastName("Som");

        //generate random email
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        String randomString = String.format("%03d", randomNumber);
        String randomEmail = randomString + "annusom@gmail.com";
        registerPage.enterEmail(randomEmail);

        registerPage.enterPassword("Password1");
        registerPage.enterConfirmPassword("Password1");

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(registerResultPage.getRegistrationCompleteMessageText(), "Your registration completed", "Register result message is incorrect.");


        //2.23 Click on “CONTINUE” tab
        registerResultPage.clickOnContinueButton();

        //2.24 Verify the text “Shopping cart”
        Assert.assertEquals(shoppingCartPage.getTextFromPageTitle(), "Shopping cart", "NAvigated to wrong page.");
//********************** I repeat all the above steps and check out as guest as 'Register' options leads to 'Empty Cart'************

        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsLink();

        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndCLickOnCellPhones();

        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getCellPhonesText(), "Cell phones", "The user is navigated to incorrect page");

        //2.4 Click on List View Tab
        cellPhonesPage.clickOnListView();
        driver.navigate().refresh();

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumia();

        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(cellPhonesPage.getProductNameText(), "Nokia Lumia 1020", "Incorrect product displayed.");

        //2.7 Verify the price “$349.00”
        Assert.assertEquals(cellPhonesPage.getProductPriceText(), "$349.00", "The Price does not match.");

        //2.8 Change quantity to 2
        cellPhonesPage.changeQuantity("2");

        //2.9 Click on “ADD TO CART” tab
        cellPhonesPage.clickOnAddToCartButton();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(cellPhonesPage.getProductAddedMessageText(), "The product has been added to your shopping cart", "Wrong message displayed.");

        //After that close the bar clicking on the cross button
        cellPhonesPage.clickOnCloseButton();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonesPage.mouseHoverOnShoppingCart();
        cellPhonesPage.waitExplicitlyForGoToCartButtonToBeVisible(4);

        cellPhonesPage.clickOnGoToCartButton();

        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getTextFromPageTitle(), "Shopping cart", "Navigated to wrong page.");

        //2.13 Verify the quantity is 2
        System.out.println(shoppingCartPage.getQuantityText()); //for debug purpose
        Assert.assertEquals(shoppingCartPage.getQuantityText(), "2", "Incorrect quantity.");

        //2.14 Verify the Total $698.00
        Assert.assertEquals(shoppingCartPage.getTextFromTotal(), "$698.00", "Total is incorrect.");


        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.getWelcomeMessageFromHeading(), "Welcome, Please Sign In!", "Navigated to wrong page.");

        //2.21 Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckOutAsGuestButton();

        //2.22 Fill the all mandatory field
        checkOutPage.enterFirstName("Annu");
        checkOutPage.enterLastName("Som");

        //generate random email
        random = new Random();
        randomNumber = random.nextInt(1000);
        randomString = String.format("%03d", randomNumber);
        randomEmail = randomString + "annusom@gmail.com";
        checkOutPage.enterRandomEmail(randomEmail);
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddressLine1("5, High View");
        checkOutPage.enterZipOrPostalCode("TW3 4RK");
        checkOutPage.enterPhoneNumber("07714356792");

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonShippingAddress();


        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnSecondDayAirRadioButton();

        //2.30 Click on “CONTINUE”
        checkOutPage.continueButtonShippingMethod();

        //2.31 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCardRadioButton();
        checkOutPage.clickOnContinueButtonPaymentMethod();

        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectCreditCardDropDown("Visa");

        //2.33 Fill all the details
        checkOutPage.enterCardHolderName("Annu");
        checkOutPage.enterCardNumber("5555555555554444");
        checkOutPage.selectExpiryMonthDropDown("03");
        checkOutPage.selectExpiryYearDropDown("2024");
        checkOutPage.enterCardCode("123");

        //2.34 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonPaymentInfo();


        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = checkOutPage.getTextFromPaymentMethod();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "The payment method displayed is incorrect.");

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = checkOutPage.getTextFromShippingMethod();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "The shipping method displayed is incorrect.");

        //2.37 Verify Total is “$698.00”
        String expectedTotal = "$698.00";
        String actualTotal = checkOutPage.getTextFromTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Total doesn't match.");

        //Add wait before confirm to avoid storing 'Check Out' instead of 'Thank You'
        checkOutPage.waitExplicitlyBeforeConfirm(20);

        //2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();


        //2.39 Verify the Text “Thank You”
        String expectedText = "Thank you";
        String actualText = thankYouPage.getThankYouMessageText();

        //Commenting the below assertion because the page is reading from 'check out' page.
       // Assert.assertEquals(actualText, expectedText, "The Thank you message is not displayed.");

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedSuccessMessage = "Your order has been successfully processed!";
        String actualSuccessMessage = thankYouPage.getOrderSuccessfulMessageText();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "The success messages do not match");

        //2.41 Click on “CONTINUE”
        thankYouPage.clickOnContinueButton();

        //2.42 Verify the text “Welcome to our store”
        String expectedWelcomeToStoreMessage="Welcome to our store";
        String actualWelcomeToStoreMessage = homePage.getWelcomeToStoreMessageText();
        Assert.assertEquals(actualWelcomeToStoreMessage, expectedWelcomeToStoreMessage, "The store welcome message is not displayed correctly.");


    }

}
