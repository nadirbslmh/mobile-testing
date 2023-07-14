@android
Feature: Adding Numbers

  Scenario: Adding two numbers
    Given user in the calculator page
    And a is 1
    And b is 2
    When I add a and b
    Then the total should be 3