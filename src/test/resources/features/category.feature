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


  Scenario Outline:  Verify the subcategories under 'Digital Content & Devices'
    When Click All menu button
    Then Digital Content & Devices "<subcategory>" should be displayed
    Examples:
      | subcategory              |
      | Prime Video              |
      | Amazon Music             |
      | Kindle E-readers & Books |
      | Amazon Appstore          |


  Scenario Outline: Verify default visible subcategories under 'Shop by Department'
    When Click All menu button
    Then Shop by Department "<visibleSubcategory>" should be displayed
    Examples:
      | visibleSubcategory |
      | Electronics        |
      | Computers          |
      | Smart Home         |
      | Arts & Crafts      |


  Scenario Outline: Verify the subcategories under 'Programs & Features'
    When Click All menu button
    Then Programs and Features "<visibleSubcategory>" should be displayed
    Examples:
      | visibleSubcategory     |
      | Gift Cards             |
      | Shop By Interest       |
      | Amazon Live            |
      | International Shopping |


  Scenario Outline: Verify the subcategories under 'Help & Settings'
    When Click All menu button
    Then Help and Settings "<subcategory>" should be displayed
    Examples:
      | subcategory      |
      | Your Account     |
      | English          |
      | United States    |
      | Customer Service |
      | Sign in          |

  @CP
  Scenario: Verify that the "See all" button is visible after Shop By Departments submenu items.
    When Click All menu button
    Then Shop By Department's See all button should displayed

  # @CP
  # Scenario: Verify that the "See less" button is displayed after clicking "See all" button  under Shop By Departments submenu items
  #  When Click All menu button
  #  And Click Shop By Department's See all button
  #  Then Shop By Department's See less button should displayed

  @CP
  Scenario: Verify that the "See all" button is visible after Programs & Features submenu items
    When Click All menu button
    Then Programs & Feature's See all button should displayed

 # @CP
 # Scenario: Verify that the "See less" button is displayed after clicking "See all" button  under Programs & Features submenu items
 #  When Click All menu button
 #  And Click Programs & Feature's See all button
 #  Then Programs & Feature's See less button should displayed





