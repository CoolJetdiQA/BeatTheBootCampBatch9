#Assignee: Chatchaya
#Website: Ferrari Kitchens - https://www.ferrarikitchens.com
#User story: US002_Ferrari
#Inquiry Form

@Chatchaya
Feature: Inquiry form

  Background: 
    Given Navigate to the URL

  #TC01_US002_Ferrari
  @RegressionTest @SmokeTest
  Scenario Outline: User submits the inquiry form successfully.
    When User enter name "<name>"
    And enter email "<email>"
    And enter phone number "<phoneNumber>"
    And fill out the questions "<questions>"
    Then User should be able to submit the inquiry form

    Examples: 
      | name               | email                      | phoneNumber | questions                                                  |
      | Johnny Red Racecar | Johnnyredracecar@gmail.com |  5714588844 | Do you have kitchen to match the paint of my red race car? |

  #TC02_US002_Ferrari #TC03_US002_Ferrari #TC04_US002_Ferrari #TC05_US002_Ferrari #TC06_US002_Ferrari
  @RegressionTest @SmokeTest
  Scenario Outline: User submits the inquiry form unsuccessfully.
    When User enter name "<name>"
    And enter email "<email>"
    And enter phone number "<phoneNumber>"
    And fill out the questions "<questions>"
    Then User should not be able to submit the inquiry form

    Examples: 
      | name               | email                      | phoneNumber | questions                                                  |
      | Johnny Red Racecar | Johnnyredracecar           |  5714588844 | Do you have kitchen to match the paint of my red race car? |
      | Johnny Red Racecar |                            |  5714588844 | Do you have kitchen to match the paint of my red race car? |
      |                    |                            |  5714588844 | Do you have kitchen to match the paint of my red race car? |
      |                    | Johnnyredracecar@gmail.com |  5714588844 | Do you have kitchen to match the paint of my red race car? |
      |                    | Johnnyredracecar           |  5714588844 | Do you have kitchen to match the paint of my red race car? |
