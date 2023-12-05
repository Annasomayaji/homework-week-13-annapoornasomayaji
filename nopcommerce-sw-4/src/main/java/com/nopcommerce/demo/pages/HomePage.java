package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    //Top Menu Bar elements
    By TopMenuElements = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    By cellPhones=By.xpath("(//a[normalize-space()='Cell phones'])[1]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownLoadsLik = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");

    //Page title of pages navigated from Top Menu Bar
    By pageTitle = By.xpath("//div[@class='page-title']/h1");

    By getWelcomeToStoreMessage=By.xpath("//div[@class='topic-block-title']/h2");

    By welcomeToStoreMessage = By.xpath("//div[@class='topic-block-title']/h2");


    //Get Page title pages navigated from Top Menu Bar
    public String getPageTitle() {
        return getTextFromElement(pageTitle);
    }


    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }


    public List<WebElement> selectNavigationBar() {
        return getElements(TopMenuElements);
    }

    public String getWelcomeToStoreMessageText(){
        return getTextFromElement(welcomeToStoreMessage);
    }

    public void mouseHoverOnElectronicsLink(){
        moveMouseOnElement(electronicsLink);
    }

    public void mouseHoverAndCLickOnCellPhones(){
        moveMouseOnElementAndClick(cellPhones);
    }
}
