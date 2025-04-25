Feature: Cart Page Access and Empty Cart Notification

  @cart
  Scenario: [Cart] User visits the cart page and sees the empty cart message
    When User clicks on the cart button at the top right
    Then User should be redirected to the cart page
    And User should see the text "Your Amazon Cart is empty" on the cart page
    When User clicks on the Sign in to your account button
    Then User should be redirected to the sign-in page

  Scenario: [Sign-in] User tries to continue without entering credentials on sign-in page
    When User clicks on the cart button at the top right
    And User clicks on the Sign in to your account button
    Then User should see "Sign in or create account" heading
    When User clicks on the Continue button without entering credentials
    Then User should see the warning message "Enter your mobile number or email"
