Feature: Google Search Functionality Title Validation
  User Story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  @smoke
  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should see Loop Academy - Google Search in the google title


  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types "Loop Academy" in the google search box and clicks enter
    Then user should see "Loop Academy - Пошук Google" in the google title


  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types "Feyruz is java king" in the google search box and clicks enter
    Then user should see "Feyruz is java king - Пошук Google" in the google title