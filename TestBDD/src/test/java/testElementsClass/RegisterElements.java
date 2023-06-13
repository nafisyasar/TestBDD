package testElementsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterElements {
	
	@FindBy(xpath = "//*[contains(@class, 'ico-register')]")
	public WebElement topRegister;
	
	@FindBy(id = "gender-male")
	public WebElement malegender;
	
	@FindBy(id = "gender-female")
	public WebElement femalegender;
	
	@FindBy(id = "FirstName")
	public WebElement firstName;
	
	@FindBy(id = "LastName")
	public WebElement lastName;
	
	@FindBy(id = "Email")
	public WebElement email;
	
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//*[contains(@class, 'button-1 register-next-step-button')]")
	public WebElement bottomRegister;
	
	
	

}
