package com.utils.ProjRequirements;

import org.testng.annotations.DataProvider;

public final class TestDataSupplier {
	
	
	
	
	
	@DataProvider (name = "itemName")
	public Object[] dishData() 
	{
	    return new Object [] 
	    		
	    { 
	    	"Mac","Camera"
	    };
	}	
	

}
