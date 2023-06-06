package testStepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testActionsClass.LoginActions;


public class LoginStepDefinition {
	LoginActions object = new LoginActions();
	
	

	
	@Given("User is on Demo Web Shop homepage")
	public void user_is_on_Demo_Web_Shop_homepage()  {
		object.getDemoWebShopHomepage();
	    
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		
	    object.clickLogin();
	}

	@Then("User should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {
	    object.verifyLoginPage();
	}


}
