package com.utils.driverConfig;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	// restrict instantiation of Driver Object
    private DriverManager() {
    }

    private final static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return threadLocal.get();
    }

    public static void setDriver(WebDriver driver) {
        threadLocal.set(driver);
    }

}
