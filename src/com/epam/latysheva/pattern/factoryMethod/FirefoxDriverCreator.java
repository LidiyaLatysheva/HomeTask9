package com.epam.latysheva.pattern.factoryMethod;


import java.io.File;
import java.util.concurrent.TimeUnit;

import com.epam.latysheva.businessObject.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator extends WebDriverCreator {
	@Override
	public WebDriver FactoryMethod() {
		System.setProperty(Constant.GECKO_DRIVER_SYSTEM_PROPERTY, Constant.PATH_TO_GEKODRIVER);
        driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
}
