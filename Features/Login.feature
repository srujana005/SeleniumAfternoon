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

  @wip
  Scenario: Verify that user is not able to login
    with invalid credentials

    When user enters username as abcIv
    And user enters password as abcInvalidpassword
    And user clicks on login button
    Then user is on the same page

  Scenario: Verify the user is not able to login with invalid username
    When user enters username as worngUseranem
    And user clicks on login button
    Then user is on the same page
