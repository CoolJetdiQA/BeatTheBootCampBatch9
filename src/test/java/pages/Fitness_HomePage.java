package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;
import utililties.CommonMethods;

public class Fitness_HomePage {

	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//TC01_USER006 RISA
	@FindBy(xpath="//span[@class='cart_preview_total']")
	private WebElement cartTotalButton;

	//TC01_USER006 RISA
	@FindBy(xpath="//button[@name='add_to_cart']")
	private List<WebElement> addToCartList;

	//TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public WebElement getCartTotalButton() {
		return cartTotalButton;
	}
  
	//TC01_USER006 RISA
	public List<WebElement> getAddToCartList() {
		return addToCartList;
	}

	//TC01_USER006 TC02_USER006 TC03_USER006 RISA
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
		
		// Get all image sliders
		List<WebElement> sliders = this.sliders;

		String homepage = "";
		String nextpage = "";

		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.getDriver();

		for (int i = 0; i < sliders.size(); i++) {
			homepage = BaseClass.getDriver().getCurrentUrl().toLowerCase();

			executor.executeScript("arguments[0].click()", sliders.get(i));

			nextpage = BaseClass.getDriver().getTitle().toLowerCase();

			// Assert image click goes to the next page.
			Assert.assertNotEquals("FAILED! Page navigate error!", nextpage, homepage);

			BaseClass.getDriver().navigate().back();
		}
	}
}
