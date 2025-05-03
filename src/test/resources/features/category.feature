@CPall
Feature: Category Page


  Scenario: All Menu Button Visibility
    Then the All menu button should be visible

  Scenario: All Menu Button Visibility at the top-left corner
    Then the All menu button should be displayed at the top-left corner

  Scenario: All Menu Button Click ability
    Then the All menu button should be clickable


  Scenario Outline: Display of main menu headings
    When Click All menu button
    Then The main menu heading "<heading>" should be displayed
    Examples:
      | heading                   |
      | Digital Content & Devices |
      | Shop by Department        |
      | Programs & Features       |
      | Help & Settings           |


  Scenario Outline:  Validate the subcategories under 'Digital Content & Devices'
    When Click All menu button
    Then "<subcategory>" subcategory should be displayed
    Examples:
      | subcategory              |
      | Prime Video              |
      | Amazon Music             |
      | Kindle E-readers & Books |
      | Amazon Appstore          |


  Scenario: Verify default visible subcategories count 4 under 'Shop by Department'
    When Click All menu button
    Then Default visible subcategories count should be 4

  @CP
  Scenario Outline: Verify default visible subcategories under 'Shop by Department'
    When Click All menu button
    Then "<visibleSubcategory>" visible subcategory should be displayed
    Examples:
      | visibleSubcategory |
      | Electronics        |
      | Computers          |
      | Smart Home         |
      | Arts & Crafts      |









