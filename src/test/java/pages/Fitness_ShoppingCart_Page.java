package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utililties.BaseClass;
import utililties.CommonMethods;


public class Fitness_ShoppingCart_Page {
	
	public Fitness_ShoppingCart_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
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
		CommonMethods.getWaitObject();
		CommonMethods.waitForAllElementsToBeVisible(getShippingCarrierRates());
		Assert.assertTrue(getShippingCarrierRates().size()>0);
	}
	//TC01_USER006 RISA
	public void setPostalCodeInput(String postalCode) {
		CommonMethods.getWaitObject();
		CommonMethods.waitForVisibility(getPostalCodeInput());
		getPostalCodeInput().clear();
		getPostalCodeInput().sendKeys(postalCode);
	}
	//TC01_USER006 RISA
	public void setCityInput(String city) {
		CommonMethods.getWaitObject();
		CommonMethods.waitForVisibility(getCityInput());
		getCityInput().clear();
		getCityInput().sendKeys(city);
	}
	//TC01_USER006 RISA
	public void selectCountry(String countryName) {
		CommonMethods.click(selectContries);
		Select country = new Select(getSelectContries());
		country.selectByVisibleText(countryName);
	}
	//TC01_USER006 RISA
	public void selectRegion(String regionName) {
		CommonMethods.click(selectRegion);
		Select region = new Select(getSelectRegion());
		region.selectByVisibleText(regionName);
	}
	//TC03_USER006 RISA
	public void checkNoItemTextAvailable() {
		CommonMethods.waitForVisibility(getNoItemText());
		String actualText = getNoItemText().getText();
		String expectedText = "no items";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	//TC03_USER006 RISA
	public void acceptOnAlert() {
		BaseClass.getDriver().switchTo().alert().accept();
	}

}
