$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Registration.feature");
formatter.feature({
  "name": "Registration Functionality Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the Demo Web Shop homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the Register button",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on their gender \"\u003cmaleOrFemale\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cfName\u003e\" and \"\u003clName\u003e\" for their first and last name",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cvalid_email\u003e\" for their email",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cvalid_password\u003e\" for their password and reenters \"\u003cc_Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the Register button towards the bottom of the screen",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the text \"\u003cvalid_Messaage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fName",
        "lName",
        "maleOrFemale",
        "valid_email",
        "valid_password",
        "c_Password",
        "valid_Message"
      ]
    },
    {
      "cells": [
        "Nafis",
        "Yasar",
        "Male",
        "nafisyasar",
        "monkey2785",
        "confirmPassword",
        "Your registration completed"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to register with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Demo Web Shop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_is_on_the_Demo_Web_Shop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Register button",
  "keyword": "When "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on their gender \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.userClicksOnGender(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Nafis\" and \"Yasar\" for their first and last name",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_enters_and_for_their_first_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"nafisyasar\" for their email",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_enters_for_their_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"monkey2785\" for their password and reenters \"confirmPassword\"",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_enters_for_their_password_and_reenters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Register button towards the bottom of the screen",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_clicks_the_Register_button_towards_the_bottom_of_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the text \"\u003cvalid_Messaage\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.userShouldSeeTheText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should not be able to register with an email already registered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the Demo Web Shop homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the Register button",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on their gender \u0027\u003cmaleOrFemale\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cfName\u003e\" and \"\u003clName\u003e\" for their first and last name",
  "keyword": "And "
});
formatter.step({
  "name": "User enters existing \"\u003cexisting_email\u003e\" for their email",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cvalid_password\u003e\" for their password and reenters \"\u003cc_Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the Register button towards the bottom of the screen",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the text \"\u003cinvalid_Messaage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fName",
        "lName",
        "maleOrFemale",
        "existing_email",
        "valid_password",
        "c_Password",
        "invalid_Message"
      ]
    },
    {
      "cells": [
        "Nafis",
        "Yasar",
        "Male",
        "nafisyasar@gmail.com",
        "monkey2785",
        "confirmPassword",
        "The specified email already exists"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should not be able to register with an email already registered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Demo Web Shop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_is_on_the_Demo_Web_Shop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Register button",
  "keyword": "When "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on their gender \u0027Male\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.userClicksOnGender(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Nafis\" and \"Yasar\" for their first and last name",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_enters_and_for_their_first_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters existing \"nafisyasar@gmail.com\" for their email",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.userEntersExistingEmail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"monkey2785\" for their password and reenters \"confirmPassword\"",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_enters_for_their_password_and_reenters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Register button towards the bottom of the screen",
  "keyword": "And "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.user_clicks_the_Register_button_towards_the_bottom_of_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the text \"\u003cinvalid_Messaage\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDefinitions.RegisterStepDefinitions.userShouldSeeTheText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});