@SmokeFeature
Feature: Test the login functionality of OrangeHRM

@smoketest
Scenario: Test the valid login

Given user is on loginpage
When user enters username and password
And click on login button
Then user should land on homepage


Scenario: Test the valid login

Given user is on loginpage
When user enters username and password
And click on login button
Then user should land on homepage