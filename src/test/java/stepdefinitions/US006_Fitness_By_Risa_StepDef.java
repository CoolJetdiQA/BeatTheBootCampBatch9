package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import groovy.transform.Undefined.EXCEPTION;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;

public class US006_Fitness_By_Risa_StepDef extends CommonMethods {

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	@Given("Open the browser and navigate to the website")
	public void Open_the_browser_and_navigate_to_the_website() {
		getDriver().get(getProperty("FitnessAvenueUrl"));
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	@When("User add items to the cart")
	public void user_add_items_to_the_cart() {
		getFtHomePage().clickFirstProduct();
		getFtHomePage().getCartTotalButton().click();
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	@When("check the items in the cart")
	public void check_the_items_in_the_cart() {
		try {
			waitForClickability(getFtHomePage().getCartTotalButton());
			getFtHomePage().getCartTotalButton().click();
		} catch (EXCEPTION e) {
			e.printStackTrace();
		}
	}

	// TC01_USER006 RISA

	@And("enter the shipping details")
	public void enter_the_shipping_details() {
		try {
			waitForVisibility(getFtShoppingCartPage().getPostalCodeInput());
			getFtShoppingCartPage().setPostalCodeInput("22041");
			getFtShoppingCartPage().setCityInput("Falls Church");
			getFtShoppingCartPage().selectCountry("United States");
			getFtShoppingCartPage().selectRegion("Virginia");
			schrollDown();
			getFtShoppingCartPage().getEstimatesButton().click();
		} catch (EXCEPTION e) {
			e.printStackTrace();
		}
	}

	// TC01_USER006 RISA
	@Then("Verify User should be able to see shipping options are shown")
	public void verify_user_should_be_able_to_see_shipping_options_are_shown() {
		getFtShoppingCartPage().checkShownEstimates();
		takeScreenshot("TC01_USER006.//cherrysucks/estimates.png");
	}

	// TC02_USER006 RISA
	@Then("Verify User should be able to continue shopping")
	public void verify_user_should_be_able_to_continue_shopping() {
		try {
			waitForClickability(getFtShoppingCartPage().getContinueShoppingButton());
			getFtShoppingCartPage().getContinueShoppingButton().click();
			takeScreenshot(getTimeStemp());
		} catch (EXCEPTION e) {
			e.printStackTrace();
		}
	}

	// TC03_USER006 RISA
	@Then("empty the cart")
	public void empty_the_cart() {
		getFtShoppingCartPage().getClearButton().click();
		getFtShoppingCartPage().acceptOnAlert();
	}

	// TC03_USER006 RISA
	@Then("Verify There are no items in your cart text is shown")
	public void verify_there_are_no_items_in_your_cart_text_is_shown() {
		getFtShoppingCartPage().checkNoItemTextAvailable();
		takeScreenshot(getTimeStemp());
	}

	@After
	public void tearDownMethod() {
		tearDown();
	}
}
