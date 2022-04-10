package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class Fitness_CommonPage {

	public Fitness_CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	// US003 Fitness - Phearum
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/form/input[1]")
	public WebElement BicycleSearch;

	// US003 Fitness - Phearum
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/form/input[2]")
	public WebElement searchBox;

	// TC03_US004_Fitness - Henry
	@FindBy(xpath = "//div[@class='currency_list']//img[contains(@alt, 'Currency USD')]")
	private WebElement USDCurrencyIcon;

	// TC03_US004_Fitness - Henry
	@FindBy(xpath = "//div[@class='currency_list']//img[contains(@alt, 'Currency CAD')]")
	private WebElement CADCurrencyIcon;

	// TC03_US004_Fitness - Henry
	@FindBy(xpath = "//span[@id='cart_preview_quantity']//following-sibling::span")
	private WebElement cartPreviewTotalCurrency;

	// TC03_US004_Fitness - Henry
	public WebElement getUSDCurrencyIcon() {
		return USDCurrencyIcon;
	}

	// TC03_US004_Fitness - Henry
	public WebElement getCADCurrencyIcon() {
		return CADCurrencyIcon;
	}

	// TC03_US004_Fitness - Henry
	public WebElement getCartPreviewTotalCurrency() {
		return cartPreviewTotalCurrency;
	}

	// TC03_US004_Fitness - Henry
	public void clickToChangeCurrency(String currency) {

		if (currency.equalsIgnoreCase("USA"))
			getUSDCurrencyIcon().click();

		if (currency.equalsIgnoreCase("Canada"))
			getCADCurrencyIcon().click();
	}

	// TC03_US004_Fitness - Henry
	public void checkCurrencyOnItemLink(String expectedCurrency) {

		WebElement currencyOnItemLink = getCartPreviewTotalCurrency();

		String actualCurrency = currencyOnItemLink.getText().replaceAll("[^a-zA-Z]", "");

		// Assert country
		Assert.assertEquals(expectedCurrency + " not found in Item Link.", expectedCurrency, actualCurrency);
	}
}
