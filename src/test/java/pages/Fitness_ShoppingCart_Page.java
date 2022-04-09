package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Fitness_ShoppingCart_Page {
	
	public Fitness_ShoppingCart_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//*[@id=\"search-button\"]")
	public WebElement SearchButton; 
	
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[8]")
	public WebElement BicycleFound; 
	
		
	@FindBy(xpath="//*[@id=\"searchApp\"]/fieldset/dl/dd/select/option[1]")
	public WebElement SearchAllGategories; 
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[8]")
	public WebElement AllItemsFound; 

	@FindBy(xpath="//*[@id=\"searchApp\"]/fieldset/dl/dd/select")
	public WebElement SearchBoxElement; 
	
	@FindBy(xpath="//option[@value='object:490']")
	public WebElement CardioSearch; 
	
	@FindBy(xpath="//div[@class='alert alert-info search-total-hits']")
	public WebElement AllCardioItems; 
	
	

}
