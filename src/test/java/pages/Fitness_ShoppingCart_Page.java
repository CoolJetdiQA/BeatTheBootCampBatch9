package pages;

import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Fitness_ShoppingCart_Page {
	
	public Fitness_ShoppingCart_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
}
