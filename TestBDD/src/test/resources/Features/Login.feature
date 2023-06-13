Feature: Login Functionality
  Scenario: User should be able to see login page after clicking login button
  
    Given User is on Demo Web Shop homepage
    When User clicks on login button
    Then User should be redirected to login page
