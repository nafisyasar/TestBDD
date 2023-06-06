$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to see login page after clicking login button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Demo Web Shop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "testStepDefinitions.LoginStepDefinition.user_is_on_Demo_Web_Shop_homepage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat testActionsClass.LoginActions.getDemoWebShopHomepage(LoginActions.java:22)\n\tat testStepDefinitions.LoginStepDefinition.user_is_on_Demo_Web_Shop_homepage(LoginStepDefinition.java:57)\n\tat ✽.User is on Demo Web Shop homepage(file:///Users/nafisyasar/git/TestBDD/TestBDD/src/test/resources/Features/Login.feature:3)\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "testStepDefinitions.LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be redirected to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "testStepDefinitions.LoginStepDefinition.user_should_be_redirected_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});