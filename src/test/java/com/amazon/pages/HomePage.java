package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.amazon.stepdefinitions.Hooks.driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement inputSearchBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='a-color-state a-text-bold']")
    public WebElement searchResultText;

}
