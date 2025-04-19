package com.amazon.stepdefinitions;

import com.amazon.base.Driver;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.get("baseURL"));
        try {
            WebDriverUtils.waitForElementToBeClickable(By.partialLinkText("Try different image"),10).click();
        } catch (Exception e) {
            System.out.println("Try image button not found");
        }
        try {
            WebDriverUtils.waitForElementToBeClickable(By.cssSelector("span.a-button-inner input.a-button-input"),10).click();
        } catch (Exception e) {
            System.out.println("Dismiss button not found");
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }


}
