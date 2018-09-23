Feature: Free CRM Application Test
Scenario: Validate Free CRM Home Page test

Given user opens browser
Then user is on login page
Then user enters credentials and logs into application
Then user navigates to home page
##Then validate logged in user name