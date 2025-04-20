package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.amazon.stepdefinitions.Hooks.driver;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id=\"nav-cart\"]")
    public WebElement cartButton;

    @FindBy(xpath = "//h3[contains(text(),'Your Amazon Cart is empty')]")
    public WebElement emptyCartMessage;

    @FindBy(xpath = "//a[@id='a-autoid-0-announce']")
    public WebElement signIntoYorAccountButton;


}
