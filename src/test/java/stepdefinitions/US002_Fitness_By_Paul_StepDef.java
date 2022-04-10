package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utililties.BaseClass;
import utililties.CommonMethods;

public class US002_Fitness_By_Paul_StepDef extends CommonMethods{
    @Given("Navigate to URL")
    public void navigate_to_url() {
    	getDriver().get(getProperty("FitnessAvenueUrl"));
    	getFtHomePage().getLogInTab().click();
//    	BaseClass.tearDown();
    }
  //@When("User login with email {string} and password {string}")
  //public void user_login_with_email_and_password(String string, String string2) {
//      // Write code here that turns the phrase above into concrete actions
//      throw new io.cucumber.java.PendingException();
  //}  
    
   
    
    @When("User login with valid email {string} and valid password  {string}")
    public void user_login_with_valid_email_and_valid_password(String email, String password) {
    	CommonMethods.waitForClickability(getFtLoginPage().getPasswordInput());
    	getFtLoginPage().getPasswordInput().click();
    	getFtLoginPage().getEmailInput().sendKeys(email);
       	getFtLoginPage().getEmailInput().click();
    	getFtLoginPage().getPasswordInput().sendKeys(password);
    	getFtLoginPage().getLogInButton().click();
//    	BaseClass.tearDown();
    }


    @Then("User have successful log in")
    public void user_have_successful_log_in() {
          Assert.assertTrue(getFtLoginPage().getWelcomeText().isDisplayed());
          
    }
    



@When("User login with invalid email {string} and invalid password {string}")
public void user_login_with_invalid_email_and_invalid_password(String email, String password) {
	CommonMethods.waitForClickability(getFtLoginPage().getPasswordInput());
	getFtLoginPage().getPasswordInput().click();
	getFtLoginPage().getEmailInput().sendKeys(email);
   	getFtLoginPage().getEmailInput().click();
	getFtLoginPage().getPasswordInput().sendKeys(password);
 	getFtLoginPage().getLogInButton().click();
// 	BaseClass.tearDown();
}
@Then("User have unsuccessful log in")
public void user_have_unsuccessful_log_in() {
	  Assert.assertTrue(getFtLoginPage().getErrorText().isDisplayed());
	  
	  
}

@After
public void tearDownMethod() {
	tearDown();
}
    

//@Then("User have unsuccessful log in")
//public void user_have_unsuccessful_log_in() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

   
    
	
}
