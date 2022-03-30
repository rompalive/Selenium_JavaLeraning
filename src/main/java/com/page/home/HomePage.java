package com.page.home;

import org.testng.asserts.SoftAssert;

public interface HomePage 
{
	

		String loginLinkTxt = "Login";
		
		String  searchTxtBoxName = "search";
		
		String lnk_MyAccount= "My Account";
			

		public void validatedSearchTxtBox(String itemName,SoftAssert assertSf);
		
		public void validatedLoginNavigation(SoftAssert assertSf);
		
		public void validatedHomePageNavigation(SoftAssert assertSf);
		
		

}
