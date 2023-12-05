package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    //Elements
    By componentsPageTitle=By.xpath("//div[@id='content']/h2");


    //Actions
    public String getComponentsTitleText(){
        return getTextFromElement(componentsPageTitle);
    }


}
