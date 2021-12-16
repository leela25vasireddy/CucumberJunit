Feature: Signup multipleusers
  Scenario: check login page by giving different user credentials
    Given the user is in login page
    When the user enter with valid credentials
    And clicks on login button
    Then the user navigates successfully to homepage