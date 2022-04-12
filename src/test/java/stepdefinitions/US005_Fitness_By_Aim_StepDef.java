package stepdefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;
import utilities.CommonMethods;

public class US005_Fitness_By_Aim_StepDef extends CommonMethods {

	@Given("user is on FitnessAvenue landing page and shown as a guest")
	public void user_is_on_fitness_avenue_landing_page_and_shown_as_a_guest() {

		getDriver().get(getProperty("FitnessAvenueUrl"));
		String actualMessage = getFtShoppingCartPage().welcomeGuest.getText();
		Assert.assertEquals(actualMessage, BaseClass.getProperty("expectedMessage"));

	}

	@When("user clicks on New Arrivals")
	public void user_clicks_on_new_arrivals() {
		getFtShoppingCartPage().clickNewArrivals.click();

	}

	@When("user check on available products")
	public void user_check_on_available_products() {
		
		List<WebElement> listOfItemsEbikes = getFtShoppingCartPage().listOfItemsEbikes;

		for (WebElement listOfItemsEbike : listOfItemsEbikes)
			listOfItemsEbike.click();
	
	}

	@When("user clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {

//
//		List<WebElement>  listOfNewArrivals = getFtShoppingCartPage(). listOfNewArrivals;		
//		for (WebElement listOfItemsNewArrival :  listOfNewArrivals)
//			listOfItemsNewArrival.click();
		
		
		
		getFtShoppingCartPage().addToCartButton.click();
		
	}

	@Then("select product is in the shopping cart")
	public void select_product_is_in_the_shopping_cart() {
		System.out.println("Select product is in the shopping cart");

	}

	@When("user clicks on eBikes")
	public void user_clicks_on_e_bikes() {
		getFtShoppingCartPage().clickOnEbikes.click();

	}

	@When("user clicks on Check out button")
	public void user_clicks_on_check_out_button() {
		getFtShoppingCartPage().checkoutButton.click();

	}

	@Then("user can see Check out page")
	public void user_can_see_check_out_page() {
		System.out.println("This is check out page");

	}
}
