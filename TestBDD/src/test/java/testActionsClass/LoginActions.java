package testActionsClass;

import org.openqa.selenium.support.PageFactory;

import testElementsClass.LoginElements;
import testUtilities.WebDriverSetup;

public class LoginActions  {
	LoginElements element;
	
	public LoginActions() {
	 element = new LoginElements();
		
	}
	public void getDemoWebShopHomepage() {
		WebDriverSetup.driver.get("https://demowebshop.tricentis.com/");
	}
	public void clickLogin() { 
		element.login.click();
	}
	public void closeDriver() {
		WebDriverSetup.QuitChromeDriver();
	}

}