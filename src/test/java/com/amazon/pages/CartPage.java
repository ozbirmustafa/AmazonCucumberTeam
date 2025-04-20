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

    public void ClickCartButton() {
        cartButton.click();
    }

    @FindBy(xpath = "//input[@data-action-type='DISMISS']")
    public WebElement dismissButton;

    public void ClickDismissButton() {
        dismissButton.click();
    }

    @FindBy(xpath = "//h3[contains(text(),'Your Amazon Cart is empty')]")
    public WebElement emptyCartMessage;

    @FindBy(xpath = "//a[@id='a-autoid-0-announce']")
    public WebElement signIntoYorAccountButton;

    public void ClickSignButton() {
        signIntoYorAccountButton.click();
    }



}
