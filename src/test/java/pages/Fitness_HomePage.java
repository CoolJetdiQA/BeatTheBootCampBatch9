package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
import utilities.CommonMethods;

public class Fitness_HomePage {

	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	// US002 Fitness - Paul
	@FindBy(xpath = "//a[contains(text(),'Login')][.//following-sibling::span]")
	private WebElement logInTab;

	// US002 Fitness - Paul
	public WebElement getLogInTab() {
		return logInTab;
	}

	// TC01_USER006 RISA
	@FindBy(xpath = "//span[@class='cart_preview_total']")
	private WebElement cartTotalButton;

	// TC01_USER006 RISA
	@FindBy(xpath = "//button[@name='add_to_cart']")
	private List<WebElement> addToCartList;

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public WebElement getCartTotalButton() {
		return cartTotalButton;
	}

	// TC01_USER006 RISA
	public List<WebElement> getAddToCartList() {
		return addToCartList;
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public void clickFirstProduct() {
		CommonMethods.getWaitObject();
		CommonMethods.waitForAllElementsToBeVisible(addToCartList);
		for (int x = 0; x < 1; x++) {
			WebElement firstItem = (WebElement) addToCartList.get(x);
			firstItem.click();
		}
	}

	// US004_Fitness - Henry
	@FindBy(xpath = "//div[@id = 'slider_home_page_banner']//img")
	private List<WebElement> sliders;

	// US004_Fitness - Henry
	public List<WebElement> getSliders() {
		return sliders;
	}

	// TC01_US004_Fitness - Henry
	public void checkImageSlider(Integer expectedNumOfSlider) {

		// Get all image sliders
		List<WebElement> sliders = getSliders();

		// Assert slider
		int actualImageSliderCount = sliders.size();
		Assert.assertEquals(
				"FAILED! Expect " + expectedNumOfSlider + " sliders but actual sliders are " + actualImageSliderCount,
				expectedNumOfSlider.intValue(), actualImageSliderCount);
	}

	// // TC02_US004_Fitness - Henry
	public void checkAllSliderNavigateToNextPage() {

		// Get all image in the sliders.
		List<WebElement> sliders = this.sliders;

		String homepage = "";
		String nextpage = "";

		for (int i = 0; i < sliders.size(); i++) {
			
			// Get current URL.
			homepage = BaseClass.getDriver().getCurrentUrl().toLowerCase();

			// Click on each image in the slider.
			CommonMethods.jsClick(sliders.get(i));

			// Get next page URL.
			nextpage = BaseClass.getDriver().getTitle().toLowerCase();

			// Assert clicking on the image click goes to the next page.
			Assert.assertNotEquals("FAILED! Page navigate error!", nextpage, homepage);

			// Go back to the previous page (home page).
			BaseClass.getDriver().navigate().back();
		}
	}
}
