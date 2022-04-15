package runners;

//import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) --> JUnit for cucumber
@CucumberOptions(		
		plugin = {	"pretty", "json:target/JSON_Reports/Cucumber.json",
				"junit:target/Cucumber_Reports/Cucumber.xml",
		"html:target/HTML_Reports/index.html"},
		dryRun = false,
		features = {"src/test/resources/features"},
		glue = {"stepdefinitions"},
		monochrome = true
		)
public class BeatTheBootCampRunnerTest extends AbstractTestNGCucumberTests{

	public BeatTheBootCampRunnerTest() {} 
}
