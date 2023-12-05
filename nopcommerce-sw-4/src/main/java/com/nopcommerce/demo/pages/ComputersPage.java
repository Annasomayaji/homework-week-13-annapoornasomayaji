package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {


    //Desktops
    By desktops =By.xpath("(//div[@class='sub-category-item'])[1]");


    public void clickOnDesktops(){
        clickOnElement(desktops);
    }


}
