package com.softwaretestingboard.magento.testbase;

import com.softwaretestingboard.magento.browserfactory.ManageBrowser;
import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends ManageBrowser {
    String browser=PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
