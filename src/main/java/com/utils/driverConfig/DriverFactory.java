package com.utils.driverConfig;
import static com.utils.constants.ProjectConstants.CHROME;
import static com.utils.constants.ProjectConstants.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	}
    //restrict Instantiation 
    private DriverFactory() {
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        if(browser.equals(CHROME)) 
        driver = new ChromeDriver();
        else if(browser.equals(FIREFOX))
        driver= new FirefoxDriver();
        else
        driver=new ChromeDriver(); //defaults to chrome driver if browser fails to match
        return driver;

    }


}
