Feature: Odd or Even feature

  Scenario: Ask a number to get odd
    Given Ask a number
    When A number is 3
    Then The result is "ODD"

  Scenario: Ask a number to get even
    Given Ask a number
    When A number is 4
    Then The result is "EVEN"
