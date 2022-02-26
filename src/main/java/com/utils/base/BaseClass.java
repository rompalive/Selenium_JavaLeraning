package com.utils.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setConfig()
	{
		System.setProperty("webdriver.chrome.driver", "/home/rajesh/git4/Selenium_JavaLeraning/src/main/resources/drivers/chromedriver");
	}
	
	
	@BeforeMethod
	public void InitializeDriver() {
		driver = new ChromeDriver();
	}
	
	
	@AfterMethod
	public void flushDriver() {
		driver.quit();
	}

}
