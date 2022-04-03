package pages;

import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Ferrari_Kitchens_HomePage {
	
	public Ferrari_Kitchens_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	

}
