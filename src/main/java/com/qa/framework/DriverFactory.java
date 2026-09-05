package com.qa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverFactory {
    private DriverFactory() {}

    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        if ("true".equalsIgnoreCase(System.getenv("HEADLESS"))) {
            options.addArguments("--headless=new");
        }
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
