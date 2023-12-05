package com.softwaretestingboard.magento.pages.gears;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPages extends Utility {
    //Elements
    By gearLink=By.id("ui-id-6");
    By gearBags=By.id("ui-id-25");

    //Actions
    public void mouseHoverOnGearLink(){
        moveMouseOnElement(gearLink);
    }

    public void mouseHoverAndClickOnBags(){
        moveMouseOnElementAndClick(gearBags);
    }

}
