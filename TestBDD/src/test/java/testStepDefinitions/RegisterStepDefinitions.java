package testStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testActionsClass.RegisterActions;

public class RegisterStepDefinitions {
	RegisterActions obj = new RegisterActions();
	
	@Given("User is on the Demo Web Shop homepage")
	public void user_is_on_the_Demo_Web_Shop_home_page() {
		obj.getDemoWebShop();
		
	}

	@When("User clicks on the Register button")
	public void user_clicks_on_the_Register_button() {
	    
	    obj.clickRegister();
	}

	@When("User clicks on their gender {string}")
	public void userClicksOnGender (String gender) {
		obj.clickGender(gender);

	}


	@When("User enters {string} and {string} for their first and last name")
	public void user_enters_and_for_their_first_and_last_name(String nafis, String yasar) {
	   obj.enterFirstandLastName(nafis, yasar);
	}

	
	@When("User enters {string} for their email")
	public void user_enters_for_their_email(String fEmail) {
		
	    obj.enterEmail(fEmail);
	}
	
	
	@When("User enters existing {string} for their email")
	public void userEntersExistingEmail(String fEmail) {
		
	    obj.enterExistingEmail(fEmail);
	}
	

	@When("User enters {string} for their password and reenters {string}")
	public void user_enters_for_their_password_and_reenters(String password, String confirmPassword) {
	    obj.enterPassword(password, confirmPassword);
	}

	@When("User clicks the Register button towards the bottom of the screen")
	public void user_clicks_the_Register_button_towards_the_bottom_of_the_screen() {
	    obj.clickBottomRegister();
	}

	@Then("User should see the text {string}")
	public void userShouldSeeTheText(String string) {
	   

	}




}
