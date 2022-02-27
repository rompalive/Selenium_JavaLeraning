package com.utils.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;  
public class PropertiesRead {  
  
	static Map<String,String> configMap = new HashMap<>();
	
    static{
    		FileReader reader;
			try {
				reader = new FileReader("/home/rajesh/git4/Selenium_JavaLeraning/src/test/resources/config/config.properties");
				Properties pRead=new Properties(); 
				pRead.load(reader); 
				Iterator itr=pRead.entrySet().iterator();
				while(itr.hasNext())
				{
					Map.Entry entry=(Map.Entry)itr.next();  
					String key = String.valueOf(entry.getKey());
					String value = String.valueOf(entry.getValue());
					configMap.put(key,value);; 
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
    		 
    		 
    	}
      
    
      public static String getConfigValue(String key)
      {
    	  return configMap.get(key.toUpperCase());
      }
     
 
}  