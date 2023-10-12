Feature: Youtube functionlity

Background: 
Given User on Main page of youtube

Scenario: To check Serach functionlity
When User go to serach box and type "Pagol"
And Click on search icon and wait
Then User go Pagol song vedio page

Scenario: Check the Histroy of vedio on youtube
When User click on histroy option
And Move to perticular vedio click on that vedio
Then Vedio which we have click that will be started from start

