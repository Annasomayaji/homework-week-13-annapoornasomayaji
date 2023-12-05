package com.softwaretestingboard.magento.pages.gears;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearsBagsPage extends Utility {
    //Elements
    By overNightDuffle=By.xpath("//strong[@class='product name product-item-name'][normalize-space()='Overnight Duffle']");


    //Actions
    public void clickOnOverNightDuffle(){
        clickOnElement(overNightDuffle);
    }
}
