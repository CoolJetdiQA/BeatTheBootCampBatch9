package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Ferrari_Kitchens_CommonPage {

	public Ferrari_Kitchens_CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
<<<<<<< HEAD
    //US004_Ferrari_Parwin
	@FindBy(xpath = "//*[@id=\"menu-item-343\"]/a")
	private WebElement FinancingButton;
	
	//US004_Ferrari_Parwin
	@FindBy(xpath = "//a[@class='vc_general vc_btn3 vc_btn3-size-md vc_btn3-shape-square vc_btn3-style-custom']")
	private WebElement ContinueButton;
	
	//US004_Ferrari_Parwin
	@FindBy(xpath = "//*[@id=\"post-315\"]/div/div[5]/div/div/div/div/figure/a/img")
	private WebElement LightStreamButton;
	
	//US004_Ferrari_Parwin
	@FindBy(xpath = "//div[@class='entry-content']//div[1]//div[1]//div[1]//div[1]//figure[1]//div[1]//img[1]")
	private List<WebElement> allImages;

	public WebElement getFinancebtn() {

		return FinancingButton;
	}

	public WebElement getContinueButton() {

		return ContinueButton;

	}

	public WebElement getLightStreamButton() {

		return LightStreamButton;

	}

	public WebElement getFinancingButton() {

		return FinancingButton;

	}

	public List<WebElement> getallImages() {
		return allImages;

	}

=======
>>>>>>> main
}
