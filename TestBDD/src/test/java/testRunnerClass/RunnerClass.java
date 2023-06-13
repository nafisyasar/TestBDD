package testRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = { "src/test/resources/Features/Registration.feature" },
		glue = {"testStepDefinitions"}, 
		plugin = {"pretty", "html: target/cucumberreports", "json: target/cucumber-jsonreports/cucumber.json"}
		//tags = {}, 
		//monochrome = true
		)
	
	public class RunnerClass extends AbstractTestNGCucumberTests {
	
	
	
		
	

}
