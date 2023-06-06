package testActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import testElementsClass.LoginElements;
import testUtilities.WebDriverSetup;

public class LoginActions extends WebDriverSetup{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	LoginElements elements;
	
	public LoginActions() {
		this.elements= new LoginElements();
		PageFactory.initElements(WebDriverSetup.driver, elements);
	}
	
	
	public void getDemoWebShopHomepage() {
		WebDriverSetup.driver.get("https://demowebshop.tricentis.com/");
		WebDriverSetup.driver.manage().window().maximize();		
		WebDriverSetup.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverSetup.driver.manage().deleteAllCookies();		
	}
	public void clickLogin() { 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'ico-login')]")));
		
		elements.login.click();
		
	}
	public void verifyLoginPage() {
		String actualUrl = ("https://demowebshop.tricentis.com/login");
		String expectedUrl = WebDriverSetup.driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	public void closeDriver() {
		WebDriverSetup.QuitChromeDriver();
	}

}