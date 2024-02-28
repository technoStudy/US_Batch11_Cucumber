Feature: Adding Fees Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully

  Scenario Outline: Adding Fees
    And I click on the adding fees buttons
      | setup       |
      | parameter   |
      | fees        |
      | addFeesIcon |
    And I send the keys in text boxes
      | nameTextBoxFeesAdding     | <name>            |
      | codeTextBoxFeesAdding     | <code>            |
      | intergationCodeAddingFees | <intergationCode> |
      | priorityCodeAddingFees    | <priority>        |

    And  I click on the save&close and toggleBar button
    Then I should see the save fees "Fee Type successfully updated" message
    Examples:
      | name       | code | intergationCode | priority |
      | nameFees01 | 2a1  | Paypall         | 5412     |
      | nameFees02 | 2a2  | Paypalx         | 5416     |
      | nameFees03 | 2a3  | Paypaxll        | 1412     |
      | nameFees04 | 2a4  | Pxxaypall       | 50212    |
      | nameFees05 | 2a5  | Paypallxy       | 715412   |
