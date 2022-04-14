#Assignee: Aim
#Website: Fitnessavenue.ca - https://www.fitnessavenue.ca/
#User story: US005_Fitness
#As a guest, I want to be able to add items to the cart.

@AIM
Feature: Shop as guest

  #TC01_US005_Fitness
  @RegressionTest
  Scenario: Add available product to the cart from New Arrivals
    Given user is on FitnessAvenue landing page and shown as a guest
    When user clicks on New Arrivals
    And user clicks on Add to cart button and click on check out button
    Then user is able to see Review Order

  #TC02_US005_Fitness
  @RegressionTest
  Scenario: User is able to view the Item Link from eBike
    Given user is on FitnessAvenue landing page and shown as a guest
    When user clicks on eBikes
    And user clicks on Add to cart button and click on check out button
    Then user is able to see Review Order

  #TC03_US005_Fitness
  @RegressionTest
  Scenario: User is able to navigate to the Check out page
    Given user is on FitnessAvenue landing page and shown as a guest
    When user clicks on eBikes
    And user clicks on Add to cart button and click on check out button
    Then user can see Check out page
