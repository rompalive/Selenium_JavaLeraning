package com.page.homeImpl;

import org.openqa.selenium.By;
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

	public void validatedSearchTxtBox(String dishName,SoftAssert assertSf) {
		String expectedTitle = "Recipe Results for "+dishName+" | Allrecipes";
		driver.findElement(By.id(searchTxtBoxId)).sendKeys(dishName);
		driver.findElement(By.id(searchTxtBoxId)).submit();
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
		String expectedTitle = "Allrecipes | Food, friends, and recipe inspiration";
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
