package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;
public class Fitness_Login_Page {
	
	public Fitness_Login_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement emailInput;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//input(@id='login-button')")
	private WebElement logInButton;

	@FindBy(xpath="//span[@class='welcome-message']")
	private WebElement welcomeText;
	
	@FindBy(xpath="//span[@class='error']")
	private WebElement errorText;
	
	public WebElement getErrorText() {
		return errorText;
	}

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}
}