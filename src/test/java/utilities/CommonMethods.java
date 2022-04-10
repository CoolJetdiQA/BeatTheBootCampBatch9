package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer {
	
	// US002 Fitness - Paul
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		return js;
	}

	// US002 Fitness - Paul
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static void schrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,300)", "");

	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		return wait;
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static List<WebElement> waitForAllElementsToBeVisible(List<WebElement> element) {
		return getWaitObject().until(ExpectedConditions.visibilityOfAllElements(element));
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = "" + filename + getTimeStemp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}

		return picBytes;
	}

	// TC01_USER006 TC02_USER006 TC03_USER006 RISA
	public static String getTimeStemp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

		return sdf.format(date.getTime());
	}

	// US003 Fitness - Phearum
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
}
