Feature: Free CRM Login feature
Scenario Outline:Free CRM Login test
Given User is already on Login Page
When title of login page is Fre CRM
Then User enters "<username>" and "<password>"
And Userclicks on login button
Then User is in Home page


Examples:
|username|password|
|naveenk|test@123|
|test|teyehyeh|