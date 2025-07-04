Feature: Login functionality

  Scenario: Successful login
    Given User is on the login page
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks the login button
    Then Login should be successful

Scenario Outline: Successful login multiple users
Given User is on the login page
When User enters username "<username>"
And User enters password "<password>"
And User clicks the login button
Then Login should be successful

Examples:
    |username|password| 
    |standard_user|secret_sauce|
    |standard_user|secret_sauce|
    
