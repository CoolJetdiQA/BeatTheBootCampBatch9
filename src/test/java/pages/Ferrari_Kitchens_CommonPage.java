package pages;

import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;

public class Ferrari_Kitchens_CommonPage {
	
	public Ferrari_Kitchens_CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
}
