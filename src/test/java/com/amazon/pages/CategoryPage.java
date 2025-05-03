package com.amazon.pages;


import com.amazon.utilities.WebDriverUtils;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
    private List<WebElement> programsFeaturesSubHeadsList;

    @FindBy(xpath = "((//ul[@data-menu-id='1']//div[@role='heading'])[4])/parent::li/following-sibling::li")
    private List<WebElement> helpAndSettingsSubHeadsList;



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
    // The method of accessing the subheadings of Digital Content & Devices with text as a web element
    public WebElement ShopByDepartmentVisibleSubCategories(String subcategoryText) {
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(2);
        for (WebElement w : shopByDepartmentVisibleSubHeadsList) {
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
