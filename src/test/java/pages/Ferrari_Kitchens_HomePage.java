package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Ferrari_Kitchens_HomePage {

	public Ferrari_Kitchens_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	// Siri Test case 001_FerrariKitchens_Story1
	@FindBy(xpath = "//div[@class='tp-loop-wrap']")
	public List<WebElement> fourSliders;

	// Siri Test case 001_FerrariKitchens_Story2
	@FindBy(xpath = "//div[@id='rev_slider_4_1']")
	public WebElement homepageImage;

	// Siri Test case 001_FerrariKitchens_Story3
	// US001_Ferrari - Siri
	@FindBy(xpath = "//div[@class='tp-leftarrow tparrows hesperiden']")
	private WebElement leftArrow;

	// US001_Ferrari - Siri
	@FindBy(xpath = "//div[@class='tp-rightarrow tparrows hesperiden']")
	private WebElement rightArrow;

	// US001_Ferrari - Siri
	@FindBy(xpath = "//div[@id='rev_slider_4_1']/ul/li//div[contains(@class,'img')]//following::div[@class='tp-caption slidelink']")
	private List<WebElement> images;

	// US001_Ferrari - Siri
	public WebElement getLeftArrow() {
		return leftArrow;
	}

	// US001_Ferrari - Siri
	public WebElement getRightArrow() {
		return rightArrow;
	}

	// US001_Ferrari - Siri
	public List<WebElement> getImages() {
		return images;
	}

	// US001_Ferrari - Siri
	public int getID(WebElement string) {
		int id = Integer.parseInt(string.getAttribute("id").replaceAll("[^0-9]", ""));
		return id;
	}

}
