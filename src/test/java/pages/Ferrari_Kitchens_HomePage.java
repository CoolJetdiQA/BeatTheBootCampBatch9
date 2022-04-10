package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class Ferrari_Kitchens_HomePage {

	public Ferrari_Kitchens_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "//input[@name='your-name']")
	private WebElement nameInput;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "//input[@name='your-email']")
	private WebElement emailInput;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "//input[@name='tel-524']")
	private WebElement phoneInput;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "//textarea[@name='your-message']")
	private WebElement questionsInput;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "//input[@value='Send']")
	private WebElement sendButton;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "// div[contains(text(),'Thank you')]")
	private WebElement succesful;

	// Chatchaya TC01_US002_Ferrari
	@FindBy(xpath = "// div[contains(text(),'an error')]")
	private WebElement unsuccesful;

	// Chatchaya TC01_US002_Ferrari
	public WebElement getSuccesful() {
		return succesful;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getUnsuccesful() {
		return unsuccesful;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getNameInput() {
		return nameInput;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getEmailInput() {
		return emailInput;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getPhoneInput() {
		return phoneInput;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getQuestionsInput() {
		return questionsInput;
	}

	// Chatchaya TC01_US002_Ferrari
	public WebElement getSendButton() {
		return sendButton;
	}

}
