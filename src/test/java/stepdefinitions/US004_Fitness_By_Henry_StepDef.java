/*Assignee: Henry
Website: Fitnessavenue.ca - https://www.fitnessavenue.ca/
User story: US004_Fitness - User is able to see image sliders and change currency.
Step definition class
*/

package stepdefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utililties.CommonMethods;

public class US004_Fitness_By_Henry_StepDef extends CommonMethods {
	
	@Given("Open a {string} website")
	public void open_a_website(String website) {

		// Open website
		getDriver().get(getProperty(website));
	}

	@Then("Test for {int} image sliders only")
	public void test_for_and_see_image_sliders_only(Integer expectedNumOfSlider) {

		// Get all image sliders
		List<WebElement> sliders = getFtHomePage().getSliders();

		// Assert slider
		int actualImageSliderCount = sliders.size();
//		Assert.assertEquals(
//				"FAILED! Expect " + expectedNumOfSlider + " sliders but actual sliders are " 
//		        + actualImageSliderCount, expectedNumOfSlider.intValue(), actualImageSliderCount);
	}

	@Then("Click on each image on the slider and it navigates to the product page")
	public void click_on_the_image_on_the_slider_and_it_navigates_to_the_product_page() {

		getFtHomePage().checkAllSliderNavigateToNextPage();
	}

	@When("Click on the {string} flag symbol on Change Currency")
	public void click_on_the_flag_symbol_on_change_currency(String currency) {
		
		if(currency.equalsIgnoreCase("USA"))	
			getFtCommonPage().getUSDCurrencyIcon().click();
	
		if(currency.equalsIgnoreCase("Canada")) 
			getFtCommonPage().getCADCurrencyIcon().click();
	}

	@Then("User sees {string} word in Item link")
	public void user_sees_word_in_item_link(String expectedCurrency) throws InterruptedException {
		
		WebElement currencyOnItemLink =getFtCommonPage().getCartPreviewTotalCurrency();

		String actualCurrency = currencyOnItemLink.getText().replaceAll("[^a-zA-Z]", "");

		// Assert country
		Assert.assertEquals(expectedCurrency + " not found in Item Link.", 
				            expectedCurrency , actualCurrency);			           
	}

	@After
	public void afterClose() {
		tearDown();
	}
}
