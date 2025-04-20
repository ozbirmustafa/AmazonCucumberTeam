package com.amazon.base;

import com.amazon.utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Driver {

    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.get("browser").toLowerCase();

            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--disable-notifications");
                    chromeOptions.addArguments("--disable-popup-blocking");
                    chromeOptions.addArguments("--incognito");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("start-maximized");
                    driver = new EdgeDriver(edgeOptions);
                    break;

                case "headless-chrome":
                    ChromeOptions headlessChrome = new ChromeOptions();
                    headlessChrome.addArguments("--headless=new");
                    headlessChrome.addArguments("--window-size=1920,1080");
                    headlessChrome.addArguments("--disable-gpu");
                    headlessChrome.addArguments("--incognito");
                    driver = new ChromeDriver(headlessChrome);
                    driver = new ChromeDriver(headlessChrome);
                    break;

                default:
                    throw new RuntimeException("Invalid browser name: " + browser);
            }

        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}