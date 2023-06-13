Feature: Registration Functionality Test

Scenario Outline: User should be able to register with valid credentials 

Given User is on the Demo Web Shop homepage
When User clicks on the Register button
And User clicks on their gender "<maleOrFemale>"
And User enters "<fName>" and "<lName>" for their first and last name
And User enters "<valid_email>" for their email
And User enters "<valid_password>" for their password and reenters "<c_Password>" 
And User clicks the Register button towards the bottom of the screen
Then User should see the text "<valid_Messaage>"


Examples:
|fName|lName|maleOrFemale		 |valid_email					 	 |valid_password |c_Password		 |valid_Message									 	  |
|Nafis|Yasar| 	 	Male  		 |nafisyasar   |monkey2785		 |confirmPassword|Your registration completed				|
#|Nafi |Yasa |		  Female	 	 |nafisyasar   |monkey2785		 |confirmPassword|Your registration completed				|
#|Bob  |Ross	|		  Male		 	 |bobross		   |ilovecats321	 |confirmPassword|Your registration completed				|




Scenario Outline: User should not be able to register with an email already registered

Given User is on the Demo Web Shop homepage
When User clicks on the Register button
And User clicks on their gender '<maleOrFemale>'
And User enters "<fName>" and "<lName>" for their first and last name
And User enters existing "<existing_email>" for their email
And User enters "<valid_password>" for their password and reenters "<c_Password>" 
And User clicks the Register button towards the bottom of the screen
Then User should see the text "<invalid_Messaage>"


Examples: 
|fName|lName|maleOrFemale		 |existing_email					 |valid_password |c_Password		 |invalid_Message									 	|
|Nafis|Yasar| 	 	Male  		 |nafisyasar@gmail.com|monkey2785		 |confirmPassword|The specified email already exists|
#|Nafi |Yasa |		  Female	 	 |nafisyasar1@gmail.com  |monkey2785		 |confirmPassword|The specified email already exists|
#|Bob  |Ross	|		  Male		 	 |bobross@gmail.com			 |ilovecats321	 |confirmPassword|The specified email already exists|


