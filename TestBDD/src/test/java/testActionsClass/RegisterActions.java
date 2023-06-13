package testActionsClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testElementsClass.RegisterElements;
import testUtilities.WebDriverSetup;

public class RegisterActions extends WebDriverSetup  {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	RegisterElements element;
	
	public RegisterActions() {
		element = new RegisterElements();
		PageFactory.initElements(WebDriverSetup.driver, element);
	}
	
	public void getDemoWebShop() {
		WebDriverSetup.driver.get("https://demowebshop.tricentis.com/");
		WebDriverSetup.driver.manage().window().maximize();		
	}
	
	public void clickRegister() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'ico-register')]")));
		element.topRegister.click();
	}
	
	public void clickGender(String maleOrFemale) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Gender")));
		if(maleOrFemale.equals("Male")) {
			element.malegender.click();
		}else if (maleOrFemale.equals("Female")){
			element.femalegender.click();
			
		}else {
			
		}
	}
	
	public void enterFirstandLastName(String fName, String lName) {
		// nafis = "Nafis";
		// yasar = "Yasar";
		element.firstName.sendKeys(fName);
		element.lastName.sendKeys(lName);
		
	}
	
	
	public int d = 0;
	List l = new ArrayList();
	public int getRandomNumber() {
			
//		ArrayList list = new ArrayList();
		int d = ((int) (Math.random()*1000));
		
		for(int i = 0; i<= 2;i++) {
			l.add(d);	
			
		}	
		return d;		
	}

	
	public void enterEmail(String valid_email) {
		//email = "nafisyasar101@gmail.com";
		
		d = ((int) (Math.random()*1000));
		
		String fEmail = valid_email+d+"@gmail.com";
		element.email.sendKeys(fEmail);
	}
	

	public void enterExistingEmail(String valid_email) {
		//email = "nafisyasar101@gmail.com";
		
		d = ((int) (Math.random()*1000));
		
		String fEmail = valid_email+l+"@gmail.com";
		element.email.sendKeys(fEmail);
	}
	
	
	public void enterPassword(String valid_password, String c_Password) {
//		password = "monkey2785";
		c_Password = valid_password;
		element.password.sendKeys(valid_password);
		element.confirmPassword.sendKeys(c_Password);
	}
	
	public void clickBottomRegister() {
		element.bottomRegister.click();
	}
	
	public void verifyRegistration() {
		if(driver.getPageSource().contains("The specified email already exist")) {
			System.out.println("Text present");
		}else {
			System.out.println("Text absent");
		}
	}
	
	
	

}
