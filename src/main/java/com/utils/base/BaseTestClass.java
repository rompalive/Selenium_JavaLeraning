package com.utils.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utils.driverConfig.Driver;



public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod() {
        Driver.initDriver();
    }

    @AfterMethod
    public void afterMethod() {
        Driver.quitDriver();
    }
}
