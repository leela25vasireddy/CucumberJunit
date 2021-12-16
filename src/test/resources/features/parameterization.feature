Feature: login parameterization
  Scenario Outline: Enter login  with multiple user credentials
    Given the user is in weblogin page
    When the user signup with username "<username>" and password "<password>"
    And clicks signup button
    Then user signup must be successfull
    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
