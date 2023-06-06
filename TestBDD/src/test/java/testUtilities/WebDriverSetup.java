package testUtilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetup {
	
	public static WebDriver driver;
	
	public static void SetupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void QuitChromeDriver() {
		driver.quit();
	}

}
