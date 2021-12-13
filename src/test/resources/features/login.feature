Feature: feature to test login functionality
  Scenario: check login page with valid credentials
    Given the user is in login page
    When the user enter with valid credentials
    And clicks on login button
    Then the user navigates successfully to homepage.