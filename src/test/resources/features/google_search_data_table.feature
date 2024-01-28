Feature: Passing multiple parameters to the same step

  Scenario: Search multiple items
    Given user is on Google search page
    Then user searches the following item
      | items        |
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |

