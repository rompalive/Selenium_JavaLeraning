package com.page.homeImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.page.home.HomePage;
import com.utils.driverConfig.DriverManager;

public class HomePageImpl implements HomePage

{
	WebDriver driver;

	public HomePageImpl() {
		driver = DriverManager.getDriver();
	}

	public void validatedSearchTxtBox(String itemName,SoftAssert assertSf) {
		String expectedTitle = "Search - "+itemName;
		driver.findElement(By.name(searchTxtBoxName)).sendKeys(itemName);
		driver.findElement(By.name(searchTxtBoxName)).sendKeys(Keys.ENTER);;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualTitle = driver.getTitle();
		assertSf.assertEquals(expectedTitle, actualTitle);

	}

	public void validatedLoginNavigation(SoftAssert assertSf) {

		String expectedTitle = "Sign In";
		driver.findElement(By.linkText("Login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	public void validatedHomePageNavigation(SoftAssert assertSf) {
		String expectedTitle = "Your Store";
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
