@All
Feature: First

  @First
  Scenario: User navigates to the Amazon homepage
    Given User is on the Amazon homepage
    And User should see the page title as "Amazon"

  @Second
  Scenario: User searches for a product
    Given User is on the Amazon homepage
    When User searches for "hat"
    Then User should see search results for "hat"
