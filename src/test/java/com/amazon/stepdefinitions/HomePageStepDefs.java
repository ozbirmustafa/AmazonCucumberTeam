package com.amazon.stepdefinitions;

import com.amazon.base.Driver;
import com.amazon.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("User is on the Amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        // This step is already handled in the Before hook
    }

    @Given("User should see the page title as {string}")
    public void user_should_see_the_page_title_as(String title) {
        Assert.assertTrue("Title does not contain expected text: " + title,
                Driver.getDriver().getTitle().contains(title));
    }

    @When("User searches for {string}")
    public void userSearchesFor(String searchedTerm) {
        System.out.println("Searching for: " + searchedTerm);
        homePage.inputSearchBox.sendKeys(searchedTerm);
        homePage.searchButton.click();
    }

    @Then("User should see search results for {string}")
    public void userShouldSeeSearchResultsFor(String expectedText) {
        String actualText = homePage.searchResultText.getText();
        Assert.assertTrue("Search result text does not contain expected text: " + expectedText,
                actualText.contains(expectedText));
    }
}
