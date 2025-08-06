Feature: Login feature
Background:
Given open chrome
When user enters url
@reg
Scenario: Verify that user is able to login with 
valid credentials

When user enters username as practice
And user enters password as SuperSecretPassword!
And user clicks on login button
Then user is redirected to homepage 

