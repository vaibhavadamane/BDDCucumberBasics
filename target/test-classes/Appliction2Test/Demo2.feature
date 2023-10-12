Feature: Login Fuctionlity of the OrangeHRM

Background:
Given User on login page

Scenario Outline: Sign up in OrangeHRM with differnt data 
When User enter the "<Username>"
And User enter the Password "<Pword>"
And User enter the Gender "<Gen>"
And User press Login Button
Then User Login Sucessfully

Examples:
| Username | Pword | Gen |
| Adamin | admin@123 | male |
| Vaibhav | vaibhav@123 | male |
| Siddhi | siddhi@123 | female |
| Vishakha | vishakaha@!23 | female |



