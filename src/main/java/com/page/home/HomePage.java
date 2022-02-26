package com.page.home;

import org.testng.asserts.SoftAssert;

public interface HomePage 
{
	

		String loginLinkTxt = "Login";
		
		String  searchTxtBoxId = "search-block";
			

		public void validatedSearchTxtBox(SoftAssert assertSf);
		
		public void validatedLoginNavigation(SoftAssert assertSf);
		
		public void validatedHomePageNavigation(SoftAssert assertSf);
		
		

}
