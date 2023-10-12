Feature: Profile feature

Background:
Given User should be at profile page

Scenario Outline: Create profile for user
When User enters firstname as "<firstname>"
And User enters lastname as "<lastname>"
And User enters city name as "<city>"
Then Profile should get created

Examples:
| firstname | lastname | city | 
| Virat | Kohali | Mumbai | 
| Verendera | Sahwag | Delhi | 
| MehendraSing | Dohni | Zarkhand | 
