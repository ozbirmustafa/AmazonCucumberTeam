package com.amazon.stepdefinitions;

import com.amazon.base.Driver;
import com.amazon.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartPageStepDefs {

    CartPage cartPage = new CartPage();

    @When("User clicks on the cart button at the top right")
    public void user_clicks_on_the_cart_button_at_the_top_right() {
        cartPage.cartButton.click();
    }

    @Then("User should be redirected to the cart page")
    public void user_should_be_redirected_to_the_cart_page() {
        String expectedUrl = "https://www.amazon.com/gp/cart/view.html?ref_=nav_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not redirected to the cart page", expectedUrl, actualUrl);
    }

    @And("User should see the text {string} on the cart page")
    public void userShouldSeeTheTextOnTheCartPage(String expectedText) {
        String actualText = cartPage.emptyCartMessage.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @When("User clicks on the Sign in to your account button")
    public void userClicksOnTheSignInToYourAccountButton() {
        cartPage.signIntoYorAccountButton.click();
    }

    @Then("User should be redirected to the sign-in page")
    public void user_should_be_redirected_to_the_sign_in_page() {
        String expectedUrl = "https://www.amazon.com/ap/signin/ref=cart_empty_sign_in?openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fcart%3Fapp-nav-type%3Dnone%26dc%3Ddf&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not redirected to the sign-in page", expectedUrl, actualUrl);
    }


}

