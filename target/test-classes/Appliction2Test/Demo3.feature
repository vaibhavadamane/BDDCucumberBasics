Feature: Sign Up fuctionlity

Background:
Given User on Sign Up page

Scenario: Check the login fucrionlity
When User Enter the follwing Details
| Vaibhav | Adamane | vaibhav@123 | 8235795790 |
| Siddhi | Patil | siddhi@123 | 15772897289 |
| Rahul | Adamane | rahul@123 | 79759789295|
And User click on sumbit Options
Then User sucessfully create Account
