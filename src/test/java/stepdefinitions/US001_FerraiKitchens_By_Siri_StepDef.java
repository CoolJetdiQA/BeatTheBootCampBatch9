package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utililties.BaseClass;
import utililties.CommonMethods;
import utililties.PageInitializer;

public class US001_FerraiKitchens_By_Siri_StepDef extends CommonMethods {

	@Given("User is on homepage")
	public void user_is_on_homepage() {
		BaseClass.getDriver().get(BaseClass.getProperty("FerrariKitchenUrl"));
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Then("user must be able to see the homepage has {int} sliders")
	public void user_must_be_able_to_see_the_homepage_has_sliders(Integer int1) {

		List<WebElement> listOfSliders = PageInitializer.getFkHomePage().fourSliders;
		int size = listOfSliders.size();
		Assert.assertEquals(size, 4);

	}
	@Given("Open {string} website")
	public void open_website(String website) {
		getDriver().get(getProperty(website));
	}
	@When("user click on the image")
	public void user_click_on_the_image() {

		getFkHomePage().homepageImage.click();

	}

	@Then("it should link to the gallery page")
	public void it_should_link_to_the_gallery_page() {

		String galleryUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals("https://ferrarikitchens.com/gallery/", galleryUrl);
	}


	@Given("Click < left arrow button")
	public void click_left_arrow_button() {

		// Left < arrow button.
		WebElement arrowBtn = getFkHomePage().getLeftArrow();

		// List of images.
		List<WebElement> images = getFkHomePage().getImages();

		// Assert that the image slider cannot be empty.
		Assert.assertNotEquals(0, images.size());

		WebElement image;

		int previousImageID = getFkHomePage().getID(images.get(0));
		int currentImageID;

		// Due to the nature of developer's design, clicking on the right arrow button
		// will traverse the image list from the 0th index to the (n-1)th index.
		for (int i = 0; i < images.size(); i++) {

			image = images.get(i);
			currentImageID = getFkHomePage().getID(images.get(i));

			System.out.println("Image index: " + i % images.size());
			System.out.println("Image ID " + currentImageID);

			// Assert the image slider navigates to the next image.
			// Each image ID is different.
			if (i != 0 && images.size() != 1)
				Assert.assertNotEquals(currentImageID, previousImageID);

			JavascriptExecutor executor = (JavascriptExecutor) getDriver();
			executor.executeScript("arguments[0].click()", arrowBtn);

			// Wait for the image to disappear.
			waitForInvisibility(image);

			previousImageID = currentImageID;
		}
	}

	@Given("Click > right arrow button")
	public void click_right_arrow_button() {

		// Right > arrow button.
		WebElement arrowBtn = getFkHomePage().getRightArrow();

		// List of images.
		List<WebElement> images = getFkHomePage().getImages();

		// Assert that the image slider cannot be empty.
		// Each image ID is different.
		Assert.assertNotEquals(0, images.size());

		WebElement image;

		int previousImageID = getFkHomePage().getID(images.get(0));
		int currentImageID;

		// Image index counter starts with 0th index in the list.
		int counter = 0;

		// Due to the nature of developer's design, clicking on the right arrow button
		// will traverse the image list from the 0th index
		// And then traverser from the last index and up.
		do {

			image = images.get(counter % images.size());
			currentImageID = getFkHomePage().getID(image);

			System.out.println("Image index: " + counter % images.size());
			System.out.println("Image ID " + currentImageID);

			// Assert the image slider navigates to the next image.
			if (counter != 0 && images.size() != 1)
				Assert.assertNotEquals(currentImageID, previousImageID);

			// Click right > arrow button.
			JavascriptExecutor executor = (JavascriptExecutor) getDriver();
			executor.executeScript("arguments[0].click()", arrowBtn);

			// Wait for image to disappear.
			waitForInvisibility(image);

			// Start from the last index of the image
			if (counter == 0)
				counter = images.size();

			previousImageID = currentImageID;
		} while (counter-- > 1);
	}

}