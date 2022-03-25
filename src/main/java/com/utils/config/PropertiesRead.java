package com.utils.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import com.utils.constants.ProjectConstants;  
public class PropertiesRead {  
  
	static Map<String,String> configMap = new HashMap<String, String>();
	
    static{
    		FileReader reader;
			try {
				String filePath = new File("").getCanonicalPath()+ProjectConstants.CONFIGPATH;
				reader = new FileReader(filePath);
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