package testElementsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {
	
	@FindBy(xpath = "//*[contains(@class,'ico-login')]")
	public WebElement login;

}
