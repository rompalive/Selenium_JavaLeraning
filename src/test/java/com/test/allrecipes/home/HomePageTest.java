package com.test.allrecipes.home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utils.base.ChromeExecution;

public class HomePageTest {

	WebDriver driver;

	@BeforeTest
	public void InitializeDriver() {
		driver = ChromeExecution.initialize();
	}

	@Test
	public void Chrometest() {
		driver.get("https://www.allrecipes.com/");
		driver.manage().window().maximize();
		System.out.println("The title is " + driver.getTitle());

	}

	@AfterTest
	public void flushDriver() {
		driver.quit();
	}
}