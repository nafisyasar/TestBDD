package testElementsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {
	
	@FindBy(xpath = "//*[contains(@class,'ico-login')]")
	public WebElement login;
	@FindBy(id = "Email")
	public WebElement email;
	@FindBy(id = "Password")
	public WebElement password;
	@FindBy(xpath = "//*[contains(@class, 'button-1 login-button')]")
	public WebElement secondlogin;
	
	
	
	
	//*[contains(@class,'ico-login')]
}
