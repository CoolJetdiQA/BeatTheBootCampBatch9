package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;

public class US002_Ferrari_By_Chatchaya_StepDef extends CommonMethods {


	@Given("Navigate to URL")
	public void navigate_to_url() {


//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:18
//  Given Navigate to URL
//  When User enter "<Johnny Red Racecar>"
//  And enter "<Johnnyredracecar@gmail.com>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form
//
//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:19
//  Given Navigate to URL
//  When User enter "<Johnny Red Racecar>"
//  And enter "<Johnnyredracecar@fmail.com>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form
//
//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:20
//  Given Navigate to URL
//  When User enter "<Johnny Red Racecar>"
//  And enter "<>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form
//
//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:21
//  Given Navigate to URL
//  When User enter "<>"
//  And enter "<>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form
//
//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:22
//  Given Navigate to URL
//  When User enter "<>"
//  And enter "<Johnnyredracecar@gmail.com>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form
//
//Scenario Outline: User is able to submit customer inquiries.                      # src/test/resources/feature/US002_Ferrari_By_Chatchaya.feature:23
//  Given Navigate to URL
//  When User enter "<>"
//  And enter "<Johnnyredracecar@fmail.com>"
//  And enter "<5714588844>"
//  And fill out the "<Do you have kitchen to match the paint of my red race car?>"
//  Then User should be able to submit the inquiry form

		getDriver().get(getProperty("FerrariKitchenUrl"));

	}
	
	@When("User enter name {string}")
	public void user_enter_name(String string) {
		CommonMethods.waitForClickability(getFkHomePage().getNameInput());
		getFkHomePage().getNameInput().sendKeys(string, Keys.TAB);

	}

	@When("enter email {string}")
	public void enter_email(String string) {
		CommonMethods.waitForClickability(getFkHomePage().getEmailInput());
		getFkHomePage().getEmailInput().sendKeys(string, Keys.TAB);
	}

	@When("enter phone number {string}")
	public void enter_phone_number(String string) {
		CommonMethods.waitForClickability(getFkHomePage().getPhoneInput());
	    getFkHomePage().getPhoneInput().sendKeys(string, Keys.TAB);
	}

	@When("fill out the questions {string}")
	public void fill_out_the_questions(String string) {
		CommonMethods.waitForClickability(getFkHomePage().getQuestionsInput());
	    getFkHomePage().getQuestionsInput().sendKeys(string);
	}

	@Then("User should be able to submit the inquiry form")
	public void user_should_be_able_to_submit_the_inquiry_form() {
		//wait for able click "SEND" button
		CommonMethods.waitForClickability(getFkHomePage().getSendButton());
	    getFkHomePage().getSendButton().click();
	    //Put wait for wait to find "Thank you for your message. It has been sent."
	    CommonMethods.wait(5);
	    //Assert for check success
	    String autualText = getFkHomePage().getSuccesful().getText();
	    String expectedText = "Thank you for your message. It has been sent.";   
	    Assert.assertEquals(autualText, expectedText);
	    //Screenshot for check Success
	    CommonMethods.TakesScreenshot("User should be able to submit the inquiry form.//screenshot/successLogIn.png");
	}
	
	@Then("User should not be able to submit the inquiry form")
	public void user_should_not_be_able_to_submit_the_inquiry_form() {
		CommonMethods.waitForClickability(getFkHomePage().getSendButton());
	    getFkHomePage().getSendButton().click();
	    //Put wait for wait to find "One or more fields have an error. Please check and try again."
	    CommonMethods.wait(2);
	    //Assert for check Unsuccess
	    String autualText = getFkHomePage().getUnsuccesful().getText();
	    String expectedText = "One or more fields have an error. Please check and try again.";
	    Assert.assertEquals(autualText, expectedText);
	    //Screenshot for check Fail
	    CommonMethods.TakesScreenshot("User should not be able to submit the inquiry form.//screenshotfail/unsuccessLogIn.png");
	}
	
	@After public void tearDownMethod() {     tearDown(); }
}
	
	
	
	
	
	