package com.amazon.stepdefinitions;

import com.amazon.pages.CategoryPage;
import com.amazon.utilities.WebDriverUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

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

    @Then("{string} subcategory should be displayed")
    public void subcategoryShouldBeDisplayed(String subcategory)  {
    Assert.assertTrue(categoryPage.digitalContentDevicesSubCategories(subcategory).isDisplayed());
    }


    @Then("Default visible subcategories count should be {int}")
    public void defaultVisibleSubcategoriesCountShouldBe(int visibleSubCount) {
    Assert.assertEquals(categoryPage.shopByDepartmentVisibleSubHeadsList.size(),visibleSubCount);
    }

    @Then("{string} visible subcategory should be displayed")
    public void visibleSubcategoryShouldBeDisplayed(String visibleSubcategory) {
        Assert.assertTrue(categoryPage.ShopByDepartmentVisibleSubCategories(visibleSubcategory).isDisplayed());
    }
}
