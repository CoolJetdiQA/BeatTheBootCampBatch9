#Author:ling.siriwan@gmail.com
#TC01_US001_Ferrari
Feature: feature to test homepage functionality

  Background: 
    Given User is on homepage

  Scenario: Check whether homepage has 4 sliders
    Then user must be able to see the homepage has 4 sliders

  Scenario: Check whether homepage image links to the gallery page
    When user click on the image
    Then it should link to the gallery page

  Scenario: Click "<" and ">" arrow button to go to the next image.
    Given Click < left arrow button
    And Click > right arrow button
