package com.test.allrecipes.home;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.base.BaseClass;

public class HomePageTest extends BaseClass{

	

	@Test
	public void homePageTitleTest() {
		BaseClass.driver.get("https://www.allrecipes.com/");
		BaseClass.driver.manage().window().maximize();
		Assert.assertEquals("Allrecipes | Food, friends, and recipe inspiration", "Allrecipes | Food, friends, and recipe inspiration");

	}
	
	@Test
	public void searchBlockTest() throws InterruptedException {
		String expectedTitle="Recipe Results for Chicken | Allrecipes";
		BaseClass.driver.get("https://www.allrecipes.com/");
		BaseClass.driver.manage().window().maximize();
		BaseClass.driver.findElement(By.id("search-block")).sendKeys("Chicken");
		BaseClass.driver.findElement(By.id("search-block")).submit();
		Thread.sleep(5000);
		String actualTitle=BaseClass.driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Test
	public void LoginButtonNavigationTest() throws InterruptedException {
		String expectedTitle="Sign In";
		BaseClass.driver.get("https://www.allrecipes.com/");
		BaseClass.driver.manage().window().maximize();
		BaseClass.driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		String actualTitle=BaseClass.driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	
}