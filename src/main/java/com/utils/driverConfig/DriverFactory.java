package com.utils.driverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

	static
	{
		 System.setProperty("webdriver.chrome.driver","/home/rajesh/git4/Selenium_JavaLeraning/src/main/resources/drivers/chromedriver");
		 System.setProperty("webdriver.gecko.driver","/home/rajesh/git4/Selenium_JavaLeraning/src/main/resources/drivers/geckodriver");
	}
    //restrict Instantiation 
    private DriverFactory() {
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        if(browser.equals("CHROME")) 
        driver = new ChromeDriver();
        else if(browser.equals("FIREFOX"))
        driver= new FirefoxDriver();
        else
        driver=new ChromeDriver(); //defaults to chrome driver if browser fails to match
        return driver;

    }


}
