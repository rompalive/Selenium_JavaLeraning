package com.utils.driverConfig;

import org.openqa.selenium.WebDriver;

import com.utils.config.PropertiesRead;



public class Driver {

   // restrict instantiation of Driver Object
    private Driver() {
    }

    public static void initDriver() {

        String browser = PropertiesRead.getConfigValue("BROWSER");
        if (DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(PropertiesRead.getConfigValue("URL"));
            DriverManager.getDriver().manage().window().maximize();
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
    }

    public static void quitDriver() {

        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
