package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",
		glue="stepDefinition",
		tags="@SmokeTest",
		plugin= {"pretty","html:target/cucumberReport","junit:target/cucumber.xml","json:target/jsonReport.json"})

public class RunnerTest {
	

}
	