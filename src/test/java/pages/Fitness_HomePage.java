package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;
import utililties.CommonMethods;

public class Fitness_HomePage {
	
	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//TC01_USER006 RISA
	@FindBy(xpath="//span[@class='cart_preview_total']")
	private WebElement cartTotalButton;

	//TC01_USER006 RISA
	@FindBy(xpath="//button[@name='add_to_cart']")
	private List<WebElement> addToCartList;



	//TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public WebElement getCartTotalButton() {
		return cartTotalButton;
	}
	//TC01_USER006 RISA
	public List<WebElement> getAddToCartList() {
		return addToCartList;
	}

	

	
	//TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public void clickFirstProduct() {
		CommonMethods.getWaitObject();
		CommonMethods.waitForAllElementsToBeVisible(addToCartList);
    for (int x = 0; x < 1; x++) {
        WebElement firstItem = (WebElement) addToCartList.get(x);
        firstItem.click();
       }
	}


	
}
