#Assignee: Henry
#Website: Fitnessavenue.ca - https://www.fitnessavenue.ca/
#User story: US004_Fitness
#User is able to see image sliders and change currency.

@Henry
Feature: Home Page Feature

  Background: 
    Given Open a "FitnessAvenueUrl" website

  #TC01_US004_Fitness
  Scenario: Verify that Homepage has 5 sliders
    Then Test for 5 image sliders only

  #TC02_US004_Fitness
  Scenario: Verify all sliders that can navigate to the next Product page
    Then Click on each image on the slider and it navigates to the product page

  #TC03_US004_Fitness
  Scenario: Verify user be able to change dollars currency
    When Click on the "USA" flag symbol on Change Currency
    Then User sees "USD" word in Item link
    When Click on the "Canada" flag symbol on Change Currency
    Then User sees "CAD" word in Item link
