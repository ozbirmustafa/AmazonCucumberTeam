package com.amazon.pages;


import com.amazon.base.Driver;
import com.amazon.utilities.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//a[@aria-label='See all']")
    public List<WebElement> seeAllButton;

    @FindBy(xpath = "//a[@aria-label='See less']")
    public List<WebElement> seeLessButton;

    @FindBy(xpath = "//ul[@data-menu-id='2']//a[@class='hmenu-item']")
    public List<WebElement> primeVideoSubLists;

    @FindBy(xpath = "//ul[@data-menu-id='3']//a[@class='hmenu-item']")
    public List<WebElement> amazonMusicSubLists;

    @FindBy(xpath = "//ul[@data-menu-id='4']//div[@role='heading']")
    public List<WebElement> kindleEreadersBooksHeaders;

    @FindBy(xpath = "//ul[@data-menu-id='4']//a[@class='hmenu-item']")
    public List<WebElement> kindleEreadersBooksSubcategories;

    @FindBy(xpath = "//ul[@data-menu-id='5']//a[@class='hmenu-item']")
    public List<WebElement> amazonAppstoreSubLists;


    // Digital Content & Devices , Shop by Department , Programs & Features , Help & Settings
    // The method of accessing the main menu headings with text as a web element
    public WebElement mainMenuHeadings(String headingText) {
        // TODO --> NullPointerException atabılır handle et
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

    // ==========================================================================================================
    // Prime Video , Amazon Music , Kindle E-readers & Books , Amazon Appstore
    // The method of accessing the subheadings of Digital Content & Devices with text as a web element
    public WebElement digitalContentDevicesSubCategories(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
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


    // Prime Video , Amazon Music , Kindle E-readers & Books , Amazon Appstore
    // The method of clicking the subheadings of Digital Content & Devices with text as a web element
    public void digitalContentDevicesSubCategoriesClick(String subcategoryText) {
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : digitalContentDevicesSubHeadsList) {
            if (w.getText().equals(subcategoryText)) {
                w.click();
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
    }

    // All Videos , Included with Prime , Prime Video Channels , Rent or Buy , Your Watchlist , Purchases & Rentals , Watch Anywhere , Getting Started
    // The method of accessing the subheadings of Prime Video with text as a web element
    public WebElement primeVideoSubCategories(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : primeVideoSubLists) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }

    // Amazon Music Unlimited , Free Streaming Music , Podcasts , Open Web Player , Download hte app
    // The method of accessing the subheadings of Amazon Music with text as a web element
    public WebElement amazonMusicSubCategories(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : amazonMusicSubLists) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }

    // Kindle E-readers , Kindle Store , Apps & Resources
    // The method of accessing the subheadings of Kindle E-readers & Books with text as a web element
    public WebElement kindleEreadersBooksHeadings(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : kindleEreadersBooksHeaders) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }

    // Meet the Kindle family , New Kindle , New Kindle Kids , All-new Kindle Paperwhite , All-new Kindle Paperwhite Kids , Introducing Kindle Colorsoft Signature Edition , New Kindle Scribe
    // Kindle Books , Kindle Unlimited , Prime Reading
    // Free Kindle Reading Apps , Kindle for Web , Manage Your Content and Devices , Trade-In
    // The method of accessing the subcategories of  Kindle E-readers & Books with text as a web element
    public WebElement deneme(String header, String subcategry) {
        // TODO --> NullPointerException atabılır handle et
        WebElement subcategory = null;
        for (WebElement w : kindleEreadersBooksHeaders) {
            if (w.getText().equals(header)) {
                for (WebElement z : kindleEreadersBooksSubcategories) {
                    if (z.getText().equals(subcategry)) {
                        subcategory = z;
                        //TODO --> USE LOGGING
                        System.out.println(z.getText());
                        break;
                    }
                }
            }
        }
        return subcategory;
    }

    // App store Home , Fire TV Apps & Subscriptions , Fire Tablet Apps , Search Apps , Manage Apps , Manage Subscriptions , Help
    // The method of accessing the subcategories of Amazon Appstore with text as a web element
    public WebElement amazonAppstoreSubcategory(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
        WebElement subcategory = null;
        // TODO --> change Explicit wait
        WebDriverUtils.wait(5);
        for (WebElement w : amazonAppstoreSubLists) {
            if (w.getText().equals(subcategoryText)) {
                subcategory = w;
                //TODO --> USE LOGGING
                System.out.println(w.getText());
                break;
            }
        }
        return subcategory;
    }
// ==========================================================================================================

    // Electronics , Computers , Smart Home , Arts & Crafts
    // The method of accessing the subheadings of Shop By Departments with text as a web element
    public WebElement shopByDepartmentVisibleSubCategories(String subcategoryText) {
        // TODO --> NullPointerException atabılır handle et
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
        // TODO --> NullPointerException atabılır handle et
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
        // TODO --> NullPointerException atabılır handle et
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

    public WebElement seeAllButtons(int index) {
        WebElement w = null;
        for (int i = 0; i < seeAllButton.size(); i++) {
            if (i == index) {
                w = seeAllButton.get(index);
                break;
            }
        }
        return w;
    }


    public WebElement seeLessButtons(int index) {
        WebElement w = null;
        for (int i = 0; i < seeLessButton.size(); i++) {
            if (i == index) {
                w = seeAllButton.get(index);
                break;
            }
        }
        return w;
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}