Feature: Home page functionlity

@sainity
Scenario: Valide Title
Given User should be in landing page
Then Page title should cantains "Shopping"

Scenario: Verify cart icon
Given User should be in landing page
Then Cart icon should get display

Scenario: Verify Todays deal
Given User should be in landing page
Then User click on Todays deal

@functional
Scenario: Login to app
Given User should be in landing page
When User click on sign in button
And User enter the username as "vaibhavadamane2018@gmail.com"
And User enters password as "8975688065" with Signin 


