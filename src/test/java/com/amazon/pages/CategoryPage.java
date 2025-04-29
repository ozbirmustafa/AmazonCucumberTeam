package com.amazon.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.amazon.stepdefinitions.Hooks.driver;

public class CategoryPage {

    public CategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span.hm-icon-label")
    public WebElement allMenuButton;

    @FindBy(xpath = "//div[@data-menu-id='1']//section//div[@role='heading']")
    public List<WebElement> mainMenuHeadingsList;

    @FindBy(xpath = "//section[@aria-labelledby='Digital Content & Devices']//li//div")
    public List<WebElement> dcSubcategoriesList;


    @FindBy(xpath = "//section[@aria-labelledby='Shop by Department']//div")
    public List<WebElement> visibleMenuHHH;


    @FindBy(xpath = "//div[normalize-space(text())='Digital Content & Devices']")
    public WebElement b;


    // Digital Content & Devices , Shop by Department , Programs & Features , Help & Settings
    public WebElement mainMenuHeadings(String headingText) {
        WebElement heading = null;
        for (WebElement w : mainMenuHeadingsList) {
            // TODO --> USE LOGGING
            System.out.println(w.getText());
            if (w.getText().equals(headingText)) {
                heading = w;
                break;
            }
        }
        return heading;
    }


    // Prime Video , Amazon Music , Kindle E-readers & Books , Amazon Appstore
    public WebElement dcSubcategories(String subcategoryText) {
        WebElement subcategory = null;
        for (WebElement w : dcSubcategoriesList) {
            //TODO --> USE LOGGING
            System.out.println(w.getText());
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                break;
            }
        }
        return subcategory;
    }


}
