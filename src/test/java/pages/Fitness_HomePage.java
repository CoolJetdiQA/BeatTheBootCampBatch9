package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Fitness_HomePage {

	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	

	// US004_Fitness - Henry
	@FindBy(xpath = "//div[@id = 'slider_home_page_banner']//img")
	private List<WebElement> sliders;
	

	// US004_Fitness - Henry
	public List<WebElement> getSliders() {
		return sliders;
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
