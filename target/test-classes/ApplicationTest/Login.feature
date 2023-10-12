Feature: login functionality

Scenario: login with valid credentials
Given user it at the login scerren
When user enters the username
And user enters the password
And user click on login button
Then User Should get logged in

Scenario: title verification
Given user is at the landing page
Then Title of the page should be pagetitle



