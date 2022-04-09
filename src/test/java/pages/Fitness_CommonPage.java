package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililties.BaseClass;


public class Fitness_CommonPage {
	
	public Fitness_CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[1]")
	public WebElement BicycleSearch; 

@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[2]")
     public WebElement searchBox;




}
