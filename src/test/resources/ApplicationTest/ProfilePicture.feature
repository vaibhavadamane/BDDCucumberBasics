Feature: Profile fuctuonality

Scenario: Add Profile for a user
Given User should be at home page
When User clicks on add profile button
And Upload the image
Then Profile should get added

Scenario: Update Profile for a user
Given User should be at home page
When User clicks on edit links
And Updated the image
Then Profile should get updated

Scenario: Delete Profile for a user
Given User should be at home page
When User clicks on delete profile button
Then Profile should get deleted


