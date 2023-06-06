package testStepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testUtilities.WebDriverSetup;

public class BeforeClass {
	@Before("@chrome")
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			WebDriverSetup.SetupChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}
	}

}
