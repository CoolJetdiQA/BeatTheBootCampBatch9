package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
import org.openqa.selenium.support.ui.Select;
import groovy.transform.Undefined.EXCEPTION;
import utilities.CommonMethods;


public class Fitness_ShoppingCart_Page {

	public Fitness_ShoppingCart_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

    // US003 Fitness - Phearum
	@FindBy(xpath="//*[@id=\"search-button\"]")
	public WebElement SearchButton; 
	
	// US003 Fitness - Phearum
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[8]")
	public WebElement BicycleFound; 
	
	// US003 Fitness - Phearum	
	@FindBy(xpath="//*[@id=\"searchApp\"]/fieldset/dl/dd/select/option[1]")
	public WebElement SearchAllGategories; 
  
	// US003 Fitness - Phearum
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[8]")
	public WebElement AllItemsFound; 

    // US003 Fitness - Phearum
	@FindBy(xpath="//*[@id=\"searchApp\"]/fieldset/dl/dd/select")
	public WebElement SearchBoxElement; 
	
    // US003 Fitness - Phearum
	@FindBy(xpath="//option[@value='object:490']")
	public WebElement CardioSearch; 
	
    // US003 Fitness - Phearum
	@FindBy(xpath="//div[@class='alert alert-info search-total-hits']")
	public WebElement AllCardioItems; 

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='header']/div[4]/span[1]/span[1]")
	public WebElement welcomeGuest;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='main-menu-navigation-menu-collapse']//li[8]/a")
	public WebElement clickNewArrivals;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@class='widget product_list grid']//button[not(@style='display: none;')]")
	public List<WebElement> listOfItemsEbikes;

    // US005_Fitness_Aim
	@FindBy(xpath = "//h2[text()='New Arrivals']//parent::div//following-sibling::div/div")
	public List<WebElement> listOfNewArrivals;

	// US005_Fitness_Aim
	@FindBy(xpath="//div[10]//div[5]//div[1]//form[1]//div[1]//button[1]")
	public  WebElement addToCartButton;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[1]/a")
	public WebElement clickOnEbikes;

	// US005_Fitness_Aim
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement checkoutButton;
	
	// US005_Fitness_Aim
	@FindBy(xpath = "//button[@name='shopping_cart[checkout]']")
	public WebElement checkoutButton1;
	
	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='section_review']")
	public WebElement reviewOrder;
	
	// US005_Fitness_Aim
	public WebElement getReviewOrder() {
		return reviewOrder;
	}
	
	// US005_Fitness_Aim
	public void setReviewOrder(WebElement reviewOrder) {
		this.reviewOrder = reviewOrder;
	}
	
	// US005_Fitness_Aim
	public void eBikeList() {
		List<WebElement> listOfItemsEbikes = BaseClass.getDriver().findElements(
				By.xpath("//div[@class='widget product_list grid']//button[not(@style='display: none;')]"));
		for (int i = 0; i < 2; i++) {
			CommonMethods.waitForClickability(listOfItemsEbikes.get(i));
			listOfItemsEbikes.get(i).click();
		}
	}
	
	//TC03_USER006 RISA
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	private WebElement clearButton;
	
	//TC02_USER006 RISA
	@FindBy(xpath="//button[contains(text(),'Continue Shop')]")
	private WebElement continueShoppingButton;
	
	//TC03_USER006 RISA
	@FindBy(xpath="//span[@class='text-danger']")
	private WebElement removeItemsButton;
	
	//TC03_USER006 RISA
	@FindBy(xpath="//div[@class='empty']")
	private WebElement noItemText;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//input[@id='shipping-estimates-postal-code']")
	private WebElement postalCodeInput;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//input[@id='shipping-estimates-city']")
	private WebElement cityInput;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//select[@ng-change='onCountryChange()']")
	private WebElement selectContries;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//select[@ng-model='model.regionId']")
	private WebElement selectRegion;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//div[@class='col-sm-4']//child::button")
	private WebElement estimatesButton;
	
	//TC01_USER006 RISA
	@FindBy(xpath="//tr[contains(@ng-repeat,'rate in estimates')]")
	private List<WebElement> shippingCarrierRates;
	
	//TC03_USER006 RISA
	public WebElement getClearButton() {
		return clearButton;
	}	
	
	//TC02_USER006 RISA
	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}
	
	//TC03_USER006 RISA
	public WebElement getRemoveItemsButton() {
		return removeItemsButton;
	}
	
	//TC03_USER006 RISA
	public WebElement getNoItemText() {
		return noItemText;
	}
	
	//TC01_USER006 RISA
	public WebElement getPostalCodeInput() {
		return postalCodeInput;
	}
	
	//TC01_USER006 RISA
	private WebElement getCityInput() {
		return cityInput;
	}
	
	//TC01_USER006 RISA
	private WebElement getSelectContries() {
		return selectContries;
	}
	
	//TC01_USER006 RISA
	private WebElement getSelectRegion() {
		return selectRegion;
	}
	
	//TC01_USER006 RISA
	public WebElement getEstimatesButton() {
		return estimatesButton;
	}
	//TC01_USER006 RISA
	private List<WebElement> getShippingCarrierRates() {
		return shippingCarrierRates;
	}
	
	//TC01_USER006 RISA
	public void checkShownEstimates() {
		try {
			CommonMethods.getWaitObject();
			CommonMethods.waitForAllElementsToBeVisible(getShippingCarrierRates());
			Assert.assertTrue(getShippingCarrierRates().size()>0);
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC01_USER006 RISA
	public void setPostalCodeInput(String postalCode) {
		try {
			CommonMethods.getWaitObject();
			CommonMethods.waitForVisibility(getPostalCodeInput());
			getPostalCodeInput().clear();
			getPostalCodeInput().sendKeys(postalCode);
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC01_USER006 RISA
	public void setCityInput(String city) {
		try {
			CommonMethods.getWaitObject();
			CommonMethods.waitForVisibility(getCityInput());
			getCityInput().clear();
			getCityInput().sendKeys(city);
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC01_USER006 RISA
	public void selectCountry(String countryName) {
		try {
			CommonMethods.click(selectContries);
			Select country = new Select(getSelectContries());
			country.selectByVisibleText(countryName);
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC01_USER006 RISA
	public void selectRegion(String regionName) {
		try {
			CommonMethods.click(selectRegion);
			Select region = new Select(getSelectRegion());
			region.selectByVisibleText(regionName);
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC03_USER006 RISA
	public void checkNoItemTextAvailable() {
		try {
			CommonMethods.waitForVisibility(getNoItemText());
			String actualText = getNoItemText().getText();
			String expectedText = "no items";
			Assert.assertTrue(actualText.contains(expectedText));
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
	
	//TC03_USER006 RISA
	public void acceptOnAlert() {
		try {
		BaseClass.getDriver().switchTo().alert().accept();
		}catch(EXCEPTION e) {
			e.printStackTrace();
		}
	}
}
