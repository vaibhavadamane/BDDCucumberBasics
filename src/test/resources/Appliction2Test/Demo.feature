@feature1
Feature: Youtube functionlity

Background: 
Given User on youtube main page

@functional
Scenario: To check Serach functionlity
When User go to serach box and type something
And Click on search icon
Then User go to the next page

@regression
Scenario: Check the Histroy of the youtube
When User click on histroy button
And Move to perticular vedio click on it
Then Vedio which we have click that will be started
