Feature: Cart Page Access and Empty Cart Notification

  @cart
  Scenario: User visits the cart page and sees the empty cart message
    Given User is on the Amazon home page
    When User clicks on the cart button at the top right
    And User closes the notification popup if it appears
    Then User should be redirected to the cart page
    And User should see the text "Your Amazon Cart is empty"
    When User clicks on the "Sign in to your account" button
    Then User should be redirected to the sign-in page
