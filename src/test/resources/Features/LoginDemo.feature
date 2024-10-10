Feature: Test login functionality

  Scenario: Check login is sucessful with valid creditionals
    Given browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to the home page
