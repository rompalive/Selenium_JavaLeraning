package com.utils.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExecution {
	
	public static WebDriver initialize()
	{
		System.setProperty("webdriver.chrome.driver", "/home/rajesh/git4/Selenium_JavaLeraning/src/main/resources/drivers/chromedriver");
		return new ChromeDriver();
		
	}

}
