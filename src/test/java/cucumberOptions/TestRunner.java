package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions", stepNotifications = true,
		//parameter to define the place of my steps (it needs to be in the same folder)
		//stepNotifications for having the detailed runner
		dryRun = false, //try the mapping of the steps is done
		monochrome = true,
		tags = "@MobileTest or @SmokeTest",
		plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
		)
public class TestRunner {

}
