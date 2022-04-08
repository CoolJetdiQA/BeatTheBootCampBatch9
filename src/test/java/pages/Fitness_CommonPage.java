package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Fitness_CommonPage {

	public Fitness_CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

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
}
