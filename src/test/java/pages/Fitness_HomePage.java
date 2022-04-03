package pages;

import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Fitness_HomePage {
	
	public Fitness_HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
}
