Feature: Login functionlity with data

Scenario: Login with valid credentials
Given User is at the login screen
When User enters username as "testuserone"
And User enters password as "Test@123"
And User click on sumbit button
Then User should redirect to Home Page 
