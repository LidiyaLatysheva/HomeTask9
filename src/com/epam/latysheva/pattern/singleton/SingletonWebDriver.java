package com.epam.latysheva.pattern.singleton;


import com.epam.latysheva.businessObject.Constant;
import com.epam.latysheva.pattern.decorator.MyWebDriverDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SingletonWebDriver {

    private static WebDriver driver;

    private SingletonWebDriver() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {

            System.setProperty(Constant.GECKO_DRIVER_SYSTEM_PROPERTY, Constant.PATH_TO_GEKODRIVER);
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            driver = new FirefoxDriver(capabilities);
            driver = new MyWebDriverDecorator(driver);
        }
        return driver;
    }
}
