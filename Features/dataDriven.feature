Feature: dataDriven feature

Scenario Outline: verify that user is not able to login with invalid credentails
Given user opens the browser
When user enter url 
And user enters username as <username>
And user enters passwrod as <password>
And users clicks on login button
Examples:
|username|password|
|"12345"|"pass1"|
|"hello2"|"pass2"|
|"hadmin3"|"pass3"|