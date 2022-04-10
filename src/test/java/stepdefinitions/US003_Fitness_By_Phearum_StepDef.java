package stepdefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.core.options.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utililties.BaseClass;
import utililties.CommonMethods;
import utililties.PageInitializer;

public class US003_Fitness_By_Phearum_StepDef extends CommonMethods{

	private static final long IMPLICIT_WAIT_TIME = 10;

	@Given("open browser fitness website")
	public void open_browser_fitness_website() {
		BaseClass.getDriver().get(BaseClass.getProperty("FitnessAvenueUrl"));
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User navigate to the search text box")
	public void user_navigate_to_the_search_text_box() {
		PageInitializer.getFtCommonPage().searchBox.sendKeys("");
	}

	@When("Enter product name bicyle")
	public void enter_product_name_bicyle() {
		PageInitializer.getFtCommonPage().BicycleSearch.sendKeys("Bicycle");
		PageInitializer.getFtCommonPage().searchBox.click(); 
	}

	@Then("All Bicycle are shown")
	public void all_bicycle_are_shown() {
	  String ActualResult=PageInitializer.getFtShoppingCartPage().BicycleFound.getText(); 
	  System.out.println(ActualResult);
		}

	
	@When("User navigate to search button and click")
	public void user_navigate_to_search_button_and_click() {
		PageInitializer.getFtCommonPage().searchBox.click(); 
	}
	
	@When("User click All on the Categories field")
	public void user_click_all_on_the_categories_field() {
		//PageInitializer.getFtShoppingCartPage().SearchAllGategories.click(); 
		selectDdText(PageInitializer.getFtShoppingCartPage().SearchBoxElement, "--All--");
		PageInitializer.getFtShoppingCartPage().SearchButton.click(); 
	}

	@Then("All Product Category are shown")
	public void all_product_category_are_shown() {
		 String ActualResult2=PageInitializer.getFtShoppingCartPage().AllItemsFound.getText();  
	    System.out.println(ActualResult2);
	}

	@When("User Click Cardio on the Categories field")
	public void user_click_cardio_on_the_categories_field() {
	
		 //	Thread.sleep(3000);
		BaseClass.getDriver().manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		selectDdText(PageInitializer.getFtShoppingCartPage().SearchBoxElement, "Cardio (28)");
		
	}

	@Then("All Cadio Categories are shown")
	public void all_cadio_categories_are_shown() throws InterruptedException  {
	
			Thread.sleep(3000);
			//BaseClass.getDriver().manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
			waitForVisibility(PageInitializer.getFtShoppingCartPage().AllCardioItems);
			 String ActualResult3=PageInitializer.getFtShoppingCartPage().AllCardioItems.getText();  
		 System.out.println(ActualResult3);
	
	}
}
