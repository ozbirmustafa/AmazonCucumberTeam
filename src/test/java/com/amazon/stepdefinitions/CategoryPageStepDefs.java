package com.amazon.stepdefinitions;

import com.amazon.pages.CategoryPage;
import com.amazon.utilities.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;

import static com.amazon.utilities.WebDriverUtils.waitForElementToBeClickable;

public class CategoryPageStepDefs {

    CategoryPage categoryPage = new CategoryPage();

    @Then("the All menu button should be visible")
    public void theAllMenuButtonShouldBeVisible() {
        Assert.assertTrue("The All menu button is not displayed!", categoryPage.allMenuButton.isDisplayed());
    }

    @Then("the All menu button should be displayed at the top-left corner")
    public void theAllMenuButtonShouldBeDisplayedAtTheTopLeftCorner() {
        Point location = categoryPage.allMenuButton.getLocation();
        int x = location.getX();
        int y = location.getY();

        // Sol üst köşe için makul sınırlar (x ve y sıfıra yakın olmalı)
        Assert.assertTrue("The All menu button is not at the top-left corner! X:" + x + " Y:" + y,
                x < 100 && y < 150);
    }

    @Then("the All menu button should be clickable")
    public void theAllMenuButtonShouldBeClickable() {
        // Butonun tıklanabilir olduğuna dair assertion
        boolean isButtonClickable = waitForElementToBeClickable(categoryPage.allMenuButton,5) != null;
        Assert.assertTrue("All menu button should be clikable", isButtonClickable);
    }

    @When("Click All menu button")
    public void clickAllMenuButton()  {
        categoryPage.allMenuButton.click();
        //TODO --> change with explicit wait
        WebDriverUtils.wait(5);
    }

    @Then("The main menu heading {string} should be displayed")
    public void theMainMenuHeadingShouldBeDisplayed(String mainMenuHeading)  {
        Assert.assertTrue(categoryPage.mainMenuHeadings(mainMenuHeading).isDisplayed());
    }

    @Then("Digital Content & Devices {string} should be displayed")
    public void digitalContentDevicesShouldBeDisplayed(String subcategory) {
        Assert.assertTrue(categoryPage.digitalContentDevicesSubCategories(subcategory).isDisplayed());
    }

    @Then("Shop by Department {string} should be displayed")
    public void shopByDepartmentShouldBeDisplayed(String visibleSubcategory) {
        Assert.assertTrue(categoryPage.shopByDepartmentVisibleSubCategories(visibleSubcategory).isDisplayed());
    }

    @Then("Programs and Features {string} should be displayed")
    public void programsAndFeaturesShouldBeDisplayed(String visibleSubCategory) {
        Assert.assertTrue(categoryPage.programAndFeatureVisibleSubCategories(visibleSubCategory).isDisplayed());
    }

    @Then("Help and Settings {string} should be displayed")
    public void helpAndSettingsShouldBeDisplayed(String subCategory) {
        Assert.assertTrue(categoryPage.helpAndSettingSubCategories(subCategory).isDisplayed());
    }


    @Then("Shop By Department's See all button should displayed")
    public void shopByDepartmentSSeeAllButtonShouldDisplayed() {
        Assert.assertTrue(categoryPage.seeAllButtons(0).isDisplayed());
    }

    @And("Click Shop By Department's See all button")
    public void clickShopByDepartmentSSeeAllButton() {
        categoryPage.seeAllButtons(0).click();
        WebDriverUtils.wait(3);
    }

    @Then("Shop By Department's See less button should displayed")
    public void shopByDepartmentSSeeLessButtonShouldDisplayed() {
        Assert.assertTrue(categoryPage.seeLessButtons(0).isDisplayed());
    }

    @Then("Programs & Feature's See all button should displayed")
    public void programsFeatureSSeeAllButtonShouldDisplayed() {
        Assert.assertTrue(categoryPage.seeAllButtons(1).isDisplayed());
    }

    @Then("Programs & Feature's See less button should displayed")
    public void programsFeatureSSeeLessButtonShouldDisplayed() {
        Assert.assertTrue(categoryPage.seeLessButtons(1).isDisplayed());
    };

    @And("Click Programs & Feature's See all button")
    public void clickProgramsFeatureSSeeAllButton() {
        categoryPage.seeAllButtons(1).click();
        WebDriverUtils.wait(3);
    }



}
