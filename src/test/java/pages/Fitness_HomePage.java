package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Fitness_HomePage {
	
	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//a[contains(text(),'Login')][.//following-sibling::span]")
	private WebElement logInTab;
	//a[contains(text(),'Login')][.//following-sibling::span]
	
	public WebElement getLogInTab() {
		return logInTab;
	}

	}


