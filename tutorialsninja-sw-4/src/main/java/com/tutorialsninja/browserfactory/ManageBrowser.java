package com.tutorialsninja.browserfactory;

import com.tutorialsninja.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ManageBrowser {

    public static WebDriver driver;
    String baseUrl= PropertyReader.getInstance().getProperty("baseUrl");

    public void selectBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //launch url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    //close all instances of browser
    public void closeBrowser(){
        driver.quit();
    }

}
