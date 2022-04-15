package stepdefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@Then("user is able to see Review Order")
	public void user_is_able_to_see_Review_Order() {		
		String expected = getProperty("expectedReviewOrder");
		String actual = getFtShoppingCartPage().getReviewOrder().getText();
		Assert.assertTrue(actual.contains(expected));
	}

	@When("user clicks on eBikes")
	public void user_clicks_on_e_bikes() {
		waitForVisibility(getFtShoppingCartPage().clickOnEbikes);
		getFtShoppingCartPage().clickOnEbikes.click();
	}

	@When("user clicks on Add to cart button and click on check out button")
	public void user_clicks_on_check_out_button_and_click_on_check_out_button() {
		
		List<WebElement> listOfItemsEbikes = BaseClass.getDriver().findElements(
				By.xpath("//div[@class='widget product_list grid']//button[not(@style='display: none;')]"));

		WebElement item;
		for (int i = 1; i <= listOfItemsEbikes.size(); i++) {	
			item = BaseClass.getDriver().findElement(By.xpath("(//div[@class='widget product_list grid']//button[not(@style='display: none;')])" + "[" + i + "]"));	
			item.click(); // add item to cart
		}
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(getFtShoppingCartPage().checkoutButton)));
		jsClick(getFtShoppingCartPage().checkoutButton);
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(getFtShoppingCartPage().checkoutButton1)));
		
		jsClick(getFtShoppingCartPage().checkoutButton1);
	}

	@Then("user can see Check out page")
	public void user_can_see_check_out_page() {
		String billinPageUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.fitnessavenue.ca/checkout", billinPageUrl);
	}
}