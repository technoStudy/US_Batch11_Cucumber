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
    Then  I should see the successfully message "<message>"
    And   I enter "<name>" in the search citizen text box
    And   I click on the search citizen button
    And   I click on the delete citizen button
    And   I click on the confirm delete citizen button
    And   I should see the deleted "<deleted_message>"
    Examples:
      | name    | short_name | message                          |
      | Wqrst01 | w1qe01     | Citizenship successfully created |
      | Wqrst02 | w1qe02     | Citizenship successfully created |
      | Wqrst03 | w1qe03     | Citizenship successfully created |
      | Wqrst05 | w1qe04     | Citizenship successfully created |
      | Wqrst06 | w1qe05     | Citizenship successfully created |


    # The best quality of a good tester is CLEANING UP after themselves...
