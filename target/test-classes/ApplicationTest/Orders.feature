Feature: Order fucatinality

Background:   //Here We metion thows step which cames in each steps
Given User Should be logged into the application
When User Should be at the orders page

Scenario: Fetching previously placed order informatione
And User click on past order button
Then User should be able to see the past order information

Scenario: Fetching current placed order information
And User click on cureent order button
Then User should be able to see the current order information

Scenario: Fetching cancelled order information
And User click on cancelled order button
Then User should be able to see the cancelled order information





