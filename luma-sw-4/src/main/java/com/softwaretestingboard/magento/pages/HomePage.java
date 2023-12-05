package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Elements
    By womenLink=By.id("ui-id-4");
    By womenTops=By.id("ui-id-9");
    By womenJackets=By.id("ui-id-11");
    By menLink=By.id("ui-id-5");
    By menBottoms=By.id("ui-id-18");
    By menPants=By.id("ui-id-23");


    //Actions
    public void mouseHoverOnWomenLink(){
        moveMouseOnElement(womenLink);
    }

    public void mouseHoverOnTops(){
        moveMouseOnElement(womenTops);
    }
    public void mouseHoverAndClickOnJackets(){
        moveMouseOnElementAndClick(womenJackets);
    }

    public void mouseHoverOnMenLink(){
        moveMouseOnElement(menLink);
    }
    public void mouseHoverOnBottoms(){
        moveMouseOnElement(menBottoms);
    }

    public void mouseHoverAndClickOnPants(){
        moveMouseOnElementAndClick(menPants);
    }



}
