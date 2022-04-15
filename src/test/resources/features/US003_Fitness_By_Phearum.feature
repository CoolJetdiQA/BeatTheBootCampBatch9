@Phearum
Feature: Common Page

  Background: 
    Given open browser fitness website

  #TC01_US003
  @RegressionTest
  Scenario: Verify User is able to search for the product
    When User navigate to the search text box
    And Enter product name bicyle
    Then All Bicycle are shown

  #TC02_US003
  @RegressionTest
  Scenario: Verify User is able to search all items
    When User navigate to search button and click
    And User click All on the Categories field
    Then All Product Category are shown

  #TC03_US003
  @RegressionTest
  Scenario: Verify User is able to search for cardio
    When User navigate to search button and click
    And User Click Cardio on the Categories field
    Then All Cadio Categories are shown
