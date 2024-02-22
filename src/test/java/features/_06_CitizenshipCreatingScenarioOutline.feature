Feature:

  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully

  Scenario Outline: TC01 Adding a new citizenship successfully
    When  I click the Setup button
    And   I click the Parameters button
    And   I click the Citizenship button
    And   I click add the citizenship icon
    And   I enter citizen "<name>" in the name text box
    And   I enter citizen short name "<short_name>" in the shortname text box
    And   I click on the save button
    Then  I should see the "Citizenship successfully created" message
    Examples:
      | name    | short_name   |
      | Wqrst01 | w1qe01       |
      | Wqrst02 | w1qe02       |
      | Wqrst03 | w1qe03       |
      | Wqrst05 | w1qe04       |
      | Wqrst06 | w1qe05       |

