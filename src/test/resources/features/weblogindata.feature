Feature: weblogin functionality
  Scenario: Enter login page with valid credentials
    Given the user is in webpagelogin page
    When the user enter username "leela" and password"123"
    And clicks login button
    Then the user enters successfully to homepage is "true"

@regtest
  Scenario: Enter login page with valid credentials
    Given the user is in webpagelogin page
    When the user signup with following details
      |Ajay|supernova|vasireddy@gmail.com|12345|
    And clicks login button
    Then the user enters successfully to homepage is "true"




