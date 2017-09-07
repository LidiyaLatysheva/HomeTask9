package com.epam.latysheva.pattern.factoryMethod;


import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {
    protected WebDriver driver;

    public abstract WebDriver FactoryMethod();
}
