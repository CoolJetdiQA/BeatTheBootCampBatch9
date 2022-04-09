package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utililties.BaseClass;
import utililties.CommonMethods;

public class US004_Ferrari_By_Parwin_StepDef extends CommonMethods {

	@Given("A user is able to open a \"FerrariKitchenUrl\" website")
	public void a_user_is_able_to_open_a_financing_tab() {

		// open website
		getDriver().get(getProperty("FerrariKitchenUrl"));
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("A user click on Financing button")
	public void a_user_click_on_financing_button() {
		getFkCommonPage().getFinancebtn().click();
	}

	@When("A user click on CONTINUE TO LIGHTSTREAM button")
	public void a_user_click_on_continue_to_lightstream_button()  {
		getFkCommonPage().getContinueButton().click();
	}

	@Then("A user should be able to navigate to the Financing page")
	public void a_user_should_be_able_to_navigate_to_the_financing_page() {
		String expectUrl = "https://www.lightstream.com/kitchen-remodel-financing";
		String actualResult = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectUrl, actualResult);
	}

	@When("A user click on LIGHTSTREAM image")
	public void a_user_click_on_lightstream_image() {
		getFkCommonPage().getLightStreamButton().click();
	}

	@When("A user click on the Financing tab")
	public void a_user_click_on_the_financing_tab() {
		getFkCommonPage().getFinancingButton().click();
	}

	// get all images
	@Then("A user is able to verify Financing page has three images")
	public void a_user_is_able_to_verify_financing_page_has_three_images() {
		int numimages = getFkCommonPage().getallImages().size();
		System.out.println("This page has" + numimages + " images");

		// Assert images
		int expectResult = 3;
		int ActualResult = getFkCommonPage().getallImages().size();
		Assert.assertEquals(expectResult, ActualResult);
	}

	@After
	public void afterClose() {
		tearDown();
	}
}
