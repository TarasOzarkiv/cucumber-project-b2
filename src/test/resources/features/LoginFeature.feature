Feature: Docuport Login Logout Feature

  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should see the home page for client

    Scenario: Login as an employee
      Given user is on Docuport login page
      When user enters username for employee
      And user enters password for employee
      And user clicks login button
      Then user should see the home page for employee