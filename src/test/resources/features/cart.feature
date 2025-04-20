Feature: Cart Page Access and Empty Cart Notification

  @cart
  Scenario: User visits the cart page and sees the empty cart message
    When User clicks on the cart button at the top right
    Then User should be redirected to the cart page
    And User should see the text "Your Amazon Cart is empty" on the cart page
    When User clicks on the Sign in to your account button
    Then User should be redirected to the sign-in page
