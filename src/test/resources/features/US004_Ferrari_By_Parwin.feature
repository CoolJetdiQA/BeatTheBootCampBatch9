#Assignee: Parwin
#Website: FerrariKitchens-https://ferrarikitchens.com/
#Userstory: US004_Ferrari
#As A user, I am able to get to the financing page

@Parwin
Feature: Verify Financing button Functionality 

Background: 
   Given A user is able to open a "FerrariKitchenUrl" website
   
  #TCO1_US004_Ferrari_Parwin
@SmokeTest
 Scenario: Verify user can navigate to Financing page
    When A user click on Financing button
    And  A user click on CONTINUE TO LIGHTSTREAM button
    Then A user should be able to navigate to the Financing page
      
  #TCO2_US004_Ferrari_Parwin
 @SmokeTest
 Scenario: Verify user can navigate to Homepage 
    When A user click on Financing button
    And  A user click on LIGHTSTREAM image
    Then A user should be able to navigate to the Financing page 
     
   #TCO3_US004_Ferrari_Parwin
  @SmokeTest
 Scenario: Verify Financing page has three images
    When A user click on the Financing tab
    Then A user is able to verify Financing page has three images 
     
 
    
    
    
  