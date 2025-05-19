@CPall
# This feature tests Amazon's All menu including categories and subcategories under each section
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


  Scenario: Verify that the "See all" button after the Shop by Department submenu items is visible.
    When Click All menu button
    Then Shop By Department's See all button should displayed

 # @CP
 # Scenario: Verify that the "See less" button is displayed after clicking "See all" button  under Shop By Departments submenu items
 #   When Click All menu button
 #   And Click Shop By Department's See all button
 #   Then Shop By Department's See less button should displayed


  Scenario: Verify that the "See all" button after Programs & Features submenu items is visible
    When Click All menu button
    Then Programs & Feature's See all button should displayed

 # @CP
 # Scenario: Verify that the "See less" button is displayed after clicking the "See more" button under the Programs & Feature submenu items
 #  When Click All menu button
 #  And Click Programs & Feature's See all button
 #  Then Programs & Feature's See less button should displayed


  Scenario Outline: Verify that subcategories under 'Prime Video'
    Given Click All menu button
    When Click "Prime Video"
    Then Prime Video "<subcategories>" should be displayed
    Examples:
      | subcategories        |
      | All Videos           |
      | Included with Prime  |
      | Prime Video Channels |
      | Rent or Buy          |
      | Your Watchlist       |
      | Purchases & Rentals  |
      | Watch Anywhere       |
      | Getting Started      |


  Scenario Outline: Verify that subcategories under 'Amazon Music'
    Given Click All menu button
    When Click "Amazon Music"
    Then Amazon Music "<subcategories>" should be displayed
    Examples:
      | subcategories          |
      | Amazon Music Unlimited |
      | Free Streaming Music   |
      | Podcasts               |
      | Open Web Player        |
      | Download the app       |


  Scenario Outline: Verify that subcategories under 'Kindle E-readers & Books'
    Given Click All menu button
    When Click "Kindle E-readers & Books"
    Then Kindle E-readers & Books "<subheaders>" should be displayed
    Examples:
      | subheaders       |
      | Kindle E-readers |
      | Kindle Store     |
      | Apps & Resources |


  Scenario Outline: Verify that subcategories under 'Kindle E-readers & Books'
    Given Click All menu button
    When Click "Kindle E-readers & Books"
    Then Kindle E-readers & Books "<subheader>" and "<subcategory>" should be displayed
    Examples:
      | subheader        | subcategory                                    |
      | Kindle E-readers | Meet the Kindle family                         |
      | Kindle E-readers | New Kindle                                     |
      | Kindle E-readers | New Kindle Kids                                |
      | Kindle E-readers | All-new Kindle Paperwhite                      |
      | Kindle E-readers | All-new Kindle Paperwhite Kids                 |
      | Kindle E-readers | Introducing Kindle Colorsoft Signature Edition |
      | Kindle E-readers | New Kindle Scribe                              |
      | Kindle Store     | Kindle Books                                   |
      | Kindle Store     | Kindle Unlimited                               |
      | Kindle Store     | Prime Reading                                  |
      | Apps & Resources | Free Kindle Reading Apps                       |
      | Apps & Resources | Kindle for Web                                 |
      | Apps & Resources | Manage Your Content and Devices                |
      | Apps & Resources | Trade-In                                       |

  @c
  Scenario Outline: Verify that subcategories under 'Amazon Music'
    Given Click All menu button
    When Click "Amazon Appstore"
    Then Amazon Appstore "<subcategories>" should be displayed
    Examples:
      | subcategories                |
      | Fire TV Apps & Subscriptions |
      | Fire Tablet Apps             |
      | Search Apps                  |
      | Manage Apps                  |
      | Manage Subscriptions         |
      | Help                         |


