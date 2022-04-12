package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Fitness_SignUp_Page {
	
	public Fitness_SignUp_Page() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
}
