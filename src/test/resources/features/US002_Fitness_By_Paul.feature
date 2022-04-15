@Warawat
Feature: Fitness Login Page

  Background: 
    Given Navigate to URL

  #TC03_US002_Fitness
  @RegressionTest @SmokeTest
  Scenario Outline: User successful login with email and password.
    When User login with valid email "<email>" and valid password  "<password>"
    Then User have successful log in

    Examples: 
      | Email                | Password     |
      | abcfreedom@gmail.com | abc123456789 |

  #TC01_US002_Fitness  #TC02_US002_Fitness
  @RegressionTest @SmokeTest
  Scenario Outline: User unsuccessful login with email and password.
    When User login with invalid email "<email>" and invalid password "<password>"
    Then User have unsuccessful log in

    Examples: 
      | Email | Password     |
      |       |              |
      |       | abc123456789 |
