package com.amazon.pages;


import com.amazon.utilities.WebDriverUtils;
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

    @FindBy(xpath = "//ul[@data-menu-id='1']//div[@role='heading']")
    public List<WebElement> mainMenuHeadingsList;

    @FindBy(xpath = "//a[@data-menu-id='2' or @data-menu-id='3' or @data-menu-id='4' or @data-menu-id='5']")
    public List<WebElement> digitalContentDevicesSubHeadsList;

    @FindBy(xpath = "//a[@data-menu-id='6' or @data-menu-id='7' or @data-menu-id='8' or @data-menu-id='9']/div")
    public List<WebElement> shopByDepartmentVisibleSubHeadsList;

    @FindBy(xpath = "//a[@data-menu-id='28' or  @data-menu-id='29' or @data-menu-id='30' ]")
    public List<WebElement> programsFeaturesVisibleSubHeadsList;

    @FindBy(xpath = "((//ul[@data-menu-id='1']//div[@role='heading'])[4])/parent::li/following-sibling::li//a")
    public List<WebElement> helpAndSettingsSubHeadsList;

    @FindBy(xpath = "//a[text()='Shop By Interest']")
    public WebElement shopByInterest;


    // Digital Content & Devices , Shop by Department , Programs & Features , Help & Settings
    // The method of accessing the main menu headings with text as a web element
    public WebElement mainMenuHeadings(String headingText) {
        WebElement heading = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(2);
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
    // The method of accessing the subheadings of Digital Content & Devices with text as a web element
    public WebElement digitalContentDevicesSubCategories(String subcategoryText) {
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : digitalContentDevicesSubHeadsList) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }

    // Electronics , Computers , Smart Home , Arts & Crafts
    // The method of accessing the subheadings of Shop By Departments with text as a web element
    public WebElement shopByDepartmentVisibleSubCategories(String subcategoryText) {
        WebElement visibleSubcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(2);
        for (WebElement w : shopByDepartmentVisibleSubHeadsList) {
            if (w.getText().equals(subcategoryText)) {
                visibleSubcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return visibleSubcategory;
    }


    // Gift Cards , Shop By Interest , Amazon Live , International Shopping
    // The method of accessing the subheadings of Programs & Features with text as a web element
    public WebElement programAndFeatureVisibleSubCategories(String subcategoryText) {
        WebElement visibleSubcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(2);
        for (WebElement w : programsFeaturesVisibleSubHeadsList) {
            if (subcategoryText.equals(shopByInterest.getText())) {
                visibleSubcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            } else if (w.getText().equals(subcategoryText)) {
                visibleSubcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return visibleSubcategory;
    }


    // Your Account , English , United States , Customer Service , Sign in
    // The method of accessing the subheadings of Helps & Settings with text as a web element
    public WebElement helpAndSettingSubCategories(String subcategoryText) {
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : helpAndSettingsSubHeadsList) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }
}
