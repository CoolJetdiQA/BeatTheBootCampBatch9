package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class Fitness_Login_Page {

	public Fitness_Login_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	// US002 Fitness - Paul
	@FindBy(xpath = "//input[@name='username']")
	private WebElement emailInput;

	// US002 Fitness - Paul
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordInput;

	// US002 Fitness - Paul
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement logInButton;

	// US002 Fitness - Paul
	@FindBy(xpath = "//span[@class='welcome-message']")
	private WebElement welcomeText;

	// US002 Fitness - Paul
	@FindBy(xpath = "//span[@class='error']")
	private WebElement errorText;

	// US002 Fitness - Paul
	public WebElement getErrorText() {
		return errorText;
	}

	// US002 Fitness - Paul
	public WebElement getWelcomeText() {
		return welcomeText;
	}

	// US002 Fitness - Paul
	public WebElement getEmailInput() {
		return emailInput;
	}

	// US002 Fitness - Paul
	public WebElement getPasswordInput() {
		return passwordInput;
	}

	// US002 Fitness - Paul
	public WebElement getLogInButton() {
		return logInButton;
	}
}
