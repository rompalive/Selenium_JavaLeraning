package com.utils.ProjRequirements;

import org.testng.annotations.DataProvider;

public final class TestDataSupplier {
	
	
	
	
	
	@DataProvider (name = "dish")
	public Object[] dishData() 
	{
	    return new Object [] 
	    		
	    { 
	    	"Chicken","Pasta"
	    };
	}	
	

}
