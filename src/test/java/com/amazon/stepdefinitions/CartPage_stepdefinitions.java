package com.amazon.stepdefinitions;

import com.amazon.base.Driver;
import com.amazon.pages.CartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage_stepdefinitions {

    @Given("User is on the Amazon home page")
    public void user_is_on_the_amazon_home_page() throws InterruptedException {
        // This step is already handled in the Before hook
        Driver.getDriver().get("https://www.amazon.com");
        Thread.sleep(2000);
    }
   // @When("User clicks on the cart button at the top right")
  //  public void user_clicks_on_the_cart_button_at_the_top_right() {
    //    new CartPage().ClickCartButton();

   // }
    @When("User closes the notification popup if it appears")
    public void user_closes_the_notification_popup_if_it_appears() {
        try {
            Thread.sleep(2000); // sayfanın tam yüklenmesini beklet
            CartPage cartPage = new CartPage();
            if (cartPage.dismissButton.isDisplayed()) {
                cartPage.ClickDismissButton();
            }
        } catch (Exception e) {
            System.out.println("Notification popup not found or already closed.");
        }
    }

    @When("User clicks on the cart button at the top right")
    public void user_clicks_on_the_cart_button_at_the_top_right() {
        new CartPage().ClickCartButton();

    }
    @Then("User should be redirected to the cart page")
    public void user_should_be_redirected_to_the_cart_page() {
        String expectedUrl = "https://www.amazon.com/gp/cart/view.html?ref_=nav_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not redirected to the cart page", expectedUrl, actualUrl);
    }
    @Then("User should see the text {string}")
    public void user_should_see_the_text(String string) {
      //  // Write code here that turns the phrase above into concrete actions
      //  WebElement textElement = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + string + "')]"));
      //  Assert.assertTrue("Text not found: " + string, textElement.isDisplayed());

        CartPage cartPage = new CartPage();
        String actualText = cartPage.emptyCartMessage.getText();
        Assert.assertTrue(actualText.contains(string));

    }
    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
       // WebElement button = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + string + "')]"));
       // Actions actions = new Actions(Driver.getDriver());
       // actions.moveToElement(button).click().perform();

        CartPage cartPage = new CartPage();
        if (string.equals("Sign in to your account")) {
            cartPage.ClickSignButton();
        } else {
            System.out.println("Button not found: " + string);
        }
    }
    @Then("User should be redirected to the sign-in page")
    public void user_should_be_redirected_to_the_sign_in_page() {
        String expectedUrl = "https://www.amazon.com/ap/signin/ref=cart_empty_sign_in?openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fcart%3Fapp-nav-type%3Dnone%26dc%3Ddf&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not redirected to the sign-in page", expectedUrl, actualUrl);
    }

}

