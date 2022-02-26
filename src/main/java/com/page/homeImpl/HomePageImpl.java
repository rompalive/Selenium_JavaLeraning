package com.page.homeImpl;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.page.home.HomePage;
import com.utils.base.BaseClass;

public class HomePageImpl implements HomePage

{
	WebDriver driver;

	public HomePageImpl() {
		driver = BaseClass.driver;
	}

	public void validatedSearchTxtBox(SoftAssert assertSf) {
		String expectedTitle = "Recipe Results for Chicken | Allrecipes";
		driver.findElement(By.id(searchTxtBoxId)).sendKeys("Chicken");
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
