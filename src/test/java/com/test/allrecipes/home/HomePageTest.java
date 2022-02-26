package com.test.allrecipes.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.page.homeImpl.HomePageImpl;
import com.utils.base.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void homePageTitleTest() {
		SoftAssert sofAsrt = new SoftAssert();
		HomePageImpl homePage = new HomePageImpl();
		homePage.validatedHomePageNavigation(sofAsrt);

	}

	@Test
	public void searchBlockTest() throws InterruptedException {
		SoftAssert sofAsrt = new SoftAssert();
		HomePageImpl homePage = new HomePageImpl();
		homePage.validatedSearchTxtBox(sofAsrt);
		sofAsrt.assertAll();
	}

	@Test
	public void LoginButtonNavigationTest() throws InterruptedException {

		SoftAssert sofAsrt = new SoftAssert();
		HomePageImpl homePage = new HomePageImpl();
		homePage.validatedSearchTxtBox(sofAsrt);
		sofAsrt.assertAll();

	}

}