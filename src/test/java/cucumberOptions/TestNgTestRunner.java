package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions"
		//parameter to define the place of my steps (it needs to be in the same folder)
		//stepNotifications for having the detailed runner
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
