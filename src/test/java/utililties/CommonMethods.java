package utililties;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer{

	public static void selectDdText(WebElement element, String textToSelect) {

        try {
            Select select = new Select(element);

            List<WebElement> options = select.getOptions();

            for (WebElement el : options) {
                if (el.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }

        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }
	public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 10);
        return wait;
        
    }
	public static WebElement waitForVisibility(WebElement element) {
        return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }
	
}
