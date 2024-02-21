Feature: Campus Citizenship Addition

  Scenario: Adding a new citizenship successfully
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully
    When  I click the Setup button
    And   I click the Parameters button
    And   I click the Citizenship button
    And   I click add the citizenship icon
    And   I enter "name" in the name text box
    And   I enter "short_name" in the shortname text box
    And   I click on the save button
    Then  I should see the "Citizenship successfuly created" message
