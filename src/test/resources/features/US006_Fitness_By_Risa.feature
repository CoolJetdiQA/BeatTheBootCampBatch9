#Assignee: Risa
#Website: Fitnessavenue.ca - https://www.fitnessavenue.ca/
#User story: US006_Fitness
#As a guest, I am able to add items into the cart to get the shipping cost, 
#continue shopping and fullfill the billing information.
@Risa
Feature: Shopping 

Background: 
	Given Open the browser and navigate to the website
	When User add items to the cart

#TC01_US006_Fitness
Scenario: Verify User should be able to get the shipping detail options.
	And enter the shipping details
	Then Verify User should be able to see shipping options are shown

#TC02_US006_Fitness
Scenario: Verify User should be able continue shopping after clicked on the Items button.
	And check the items in the cart
	Then Verify User should be able to continue shopping

#TC03_US006_Fitness
Scenario: Verify User should be able to empty the cart after added items into the cart.
	And empty the cart
	Then Verify There are no items in your cart text is shown


