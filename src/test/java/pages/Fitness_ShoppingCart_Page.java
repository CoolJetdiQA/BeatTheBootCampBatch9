package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Fitness_ShoppingCart_Page {

	public Fitness_ShoppingCart_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='header']/div[4]/span[1]/span[1]")
	public WebElement welcomeGuest;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='main-menu-navigation-menu-collapse']//li[8]/a")
	public WebElement clickNewArrivals;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@class='widget product_list grid']//button[not(@style='display: none;')]")
	public List<WebElement> listOfItemsEbikes;

	@FindBy(xpath = "//h2[text()='New Arrivals']//parent::div//following-sibling::div/div")
	public List<WebElement> listOfNewArrivals;

	// US005_Fitness_Aim
	@FindBy(xpath="//div[10]//div[5]//div[1]//form[1]//div[1]//button[1]")
	public  WebElement addToCartButton;

	// US005_Fitness_Aim
	@FindBy(xpath = "//div[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[1]/a")
	public WebElement clickOnEbikes;

	// US005_Fitness_Aim
	@FindBy(xpath = "//*[@id='sidebar_cart_preview']/div[2]/div[3]/button")
	public WebElement checkoutButton;

	
	
	
}
