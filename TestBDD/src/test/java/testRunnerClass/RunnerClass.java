package testRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html: target/cucumberreports", "json: target/cucumber-jsonreports/cucumber.json"}, features = { "src/test/resources/Features " }, glue = {"testStepDefinitions"}, tags = {"@sanity", "@regression"}, monochrome = true)
	
	public class RunnerClass extends AbstractTestNGCucumberTests {
		
	

}
