Feature: Free CRM Login feature
Scenario Outline:Free CRM Login test
Given User is already on Login Page
When title of login page is Fre CRM
Then User enters "<username>" and "<password>"
And Userclicks on login button
Then User is in home page
Then user mouse hovers on new contact
Then User adds "<firstname>" and "<lastname>" and "<position>" and clicks on save


Examples:
|username|password|firstname|lastname|position|
|naveenk|test@123|abcss|rtut|manager|