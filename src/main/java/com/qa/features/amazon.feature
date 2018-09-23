Feature: Amazon login feature

@Regression @First
Scenario: Amazon login scenario


Given User is already on amazon page
Then User enters the username and passwords
##Then validate the username is written on page
Then search for motog phone
Then get the page title for searched page
Then click on desired mobile to place the order


@Smoke @Second
Scenario: Plain simple
Given This is sample
##Examples:
##|username|password|
##|snehadt7@gmail.com|amazon@2016|