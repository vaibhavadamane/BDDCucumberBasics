
Feature: To validte the Product Buying fuctionlity
Background:
Given User should be suceefully login
Given User Should be Cart Page

Scenario: Validating the Tshirt buying functionlity
When User Enter Select the Tshirt
And User Click on Buy Button
Then User Should be moved on Payment Pagg

Scenario: Validating the moblie buying fuctionlity
When User Select the "Iphone14"
And User Select "Gray" Colour
And User Select it RAM 8
Then User Should be moved on Payment Pagg

Scenario Outline: Multipal user get moblie with her choice
When User Select the "<moblie>"
And User Select the "<colour>"
And User Select the <ram> GB
Then User Moved on payment page

Examples:
| moblie | colour | ram |
| IPhone | Red | 8 |
| Redmi | Nabulla Blue | 10 |
| Oppo | Black | 12 |
| Realme | White | 8 |