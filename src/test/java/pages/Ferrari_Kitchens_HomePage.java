package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Ferrari_Kitchens_HomePage {
	
	public Ferrari_Kitchens_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	// Risa test case #, story #
	@FindBy(xpath = "dsfas")
	private WebElement loginBtn;

	// Risa test case #, story #
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	

}
