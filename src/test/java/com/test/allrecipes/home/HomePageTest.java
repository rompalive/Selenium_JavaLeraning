package com.test.allrecipes.home;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page.homeImpl.HomePageImpl;
import com.utils.ProjRequirements.TestDataSupplier;
import com.utils.base.BaseTestClass;

public class HomePageTest extends BaseTestClass {

	@Test
	public void homePageTitleTest() {
		SoftAssert sofAsrt = new SoftAssert();
		HomePageImpl homePage = new HomePageImpl();
		homePage.validatedHomePageNavigation(sofAsrt);

	}

	@Test(dataProvider="dish" ,dataProviderClass=TestDataSupplier.class)
	public void searchBlockTest(String dishName) throws InterruptedException {
		SoftAssert sofAsrt = new SoftAssert();
		HomePageImpl homePage = new HomePageImpl();
		homePage.validatedSearchTxtBox(dishName,sofAsrt);
		sofAsrt.assertAll();
	}

//	@Test
	//public void LoginButtonNavigationTest() throws InterruptedException {

	//	SoftAssert sofAsrt = new SoftAssert();
	//	HomePageImpl homePage = new HomePageImpl();
	//	homePage.validatedLoginNavigation(sofAsrt);
	//	sofAsrt.assertAll();
//
	//}

}