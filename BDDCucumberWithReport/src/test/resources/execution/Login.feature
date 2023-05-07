Feature: Login Functionality

  Scenario: verify title of page
    Given User is at landling page
    When User gets the title of page
    Then Title of page should contains "Shopping"

  Scenario: Verify the cart icon
    Given User is at landling page
    Then cart icon should display

  Scenario: Login to application
    Given User is at landling page
    When User enters the username as "9423864021"
    And User enters the password as "Gargi*1"
    And User confirms signin
