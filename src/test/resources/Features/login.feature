#Author
#Date
#Description

Feature: feature to test login functionality

	@smokeTest
  Scenario: Check login is sucessful with valid credentials
  
    Given user is on login page
    When user enters usesrname and password
    And clicks on login button
    Then user is navigated to the home page

