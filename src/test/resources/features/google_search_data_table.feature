Feature: Passing multiple parameters to the same step

  @ns
  Scenario: Search multiple items
    Given user is on Google search page
    Then user searches the following item
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |

