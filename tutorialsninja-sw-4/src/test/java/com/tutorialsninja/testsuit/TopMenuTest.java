package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.desktops_and_products.DesktopsPage;
import com.tutorialsninja.pages.laptops_notebooks_and_products.LapTopsAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage =new DesktopsPage();
    ComponentsPage componentsPage=new ComponentsPage();

    LapTopsAndNoteBooksPage lapTopsAndNoteBooksPage=new LapTopsAndNoteBooksPage();

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    // 1.2 This method should click on the menu whatever name is passed as parameter.Write the following Test:
    public void selectMenu(String menu) {
        List<WebElement> showAll = homePage.showAllOptionsFromTopNav();
        try {
            for (WebElement e : showAll) {
                if (e.getText().equals(menu)) {
                    e.click();
                }
            }
        } catch (StaleElementReferenceException e) {

        }
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //  1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClickOnDesktops();
        //  1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show AllDesktops");
        //  1.3 Verify the text ‘Desktops’
        Assert.assertEquals(desktopsPage.getDeskTopTitleText(),"Desktops", "User navigated to wrong page.");
    }
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverAndClickOnLapTopsAndNoteBooks();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
       Assert.assertEquals(lapTopsAndNoteBooksPage.getLapTopsAndNoteBooksTitleText(),"Laptops & Notebooks" ,"User navigated to wrong page");

    }
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
    //3.1 Mouse hover on “Components” Tab and click
    homePage.moveMouseAndClickOnComponents();

    //3.2 call selectMenu method and pass the menu = “Show All Components”
    selectMenu("Show AllComponents");

    //3.3 Verify the text ‘Components’
    Assert.assertEquals(componentsPage.getComponentsTitleText(),"Components", "User navigated to wrong page.");
}

}
