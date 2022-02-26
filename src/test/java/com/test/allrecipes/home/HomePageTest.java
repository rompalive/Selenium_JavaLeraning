package com.test.allrecipes.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.base.ChromeExecution;

public class HomePageTest {

	WebDriver driver;

	@BeforeMethod
	public void InitializeDriver() {
		driver = ChromeExecution.initialize();
	}

	@Test
	public void homePageTitleTest() {
		driver.get("https://www.allrecipes.com/");
		driver.manage().window().maximize();
		Assert.assertEquals("Allrecipes | Food, friends, and recipe inspiration", "Allrecipes | Food, friends, and recipe inspiration");

	}
	
	@Test
	public void searchBlockTest() throws InterruptedException {
		String expectedTitle="Recipe Results for Chicken | Allrecipes";
		driver.get("https://www.allrecipes.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-block")).sendKeys("Chicken");
		driver.findElement(By.id("search-block")).submit();
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Test
	public void LoginButtonNavigationTest() throws InterruptedException {
		String expectedTitle="Sign In";
		driver.get("https://www.allrecipes.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@AfterMethod
	public void flushDriver() {
		driver.quit();
	}
}