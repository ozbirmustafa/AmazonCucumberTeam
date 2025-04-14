package com.amazon.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.amazon.stepdefinitions.Hooks.driver;

public class WebDriverUtils {

    public static void wait(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForElementToBeClickable(WebElement element, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForElementToBeClickable(By by, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static WebElement waitForElementToBeVisible(WebElement element, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOf(element));
    }
}
