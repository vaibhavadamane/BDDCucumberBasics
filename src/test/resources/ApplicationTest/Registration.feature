Feature: Registration functionality

Scenario: Creation of account for a user
Given User should be in Registration page
When User enters following information
| Vaibhav | Adamane | vaibhavadamane13@gmail.com | 8975688065 |
| Kunal | Adamane | kunaladamane14@gmail.com | 9835527757 |
And Click on submit button
Then User gets created


