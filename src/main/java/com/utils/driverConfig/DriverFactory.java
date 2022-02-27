package com.utils.driverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

    //restrict Instantiation 
    private DriverFactory() {
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","/home/rajesh/git4/Selenium_JavaLeraning/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        return driver;

    }


}
