Feature: Create Country with DataTable

  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully

  @Regression
  Scenario: Create a new Country
    And I click on the element in left navigation
      | setup             |
      | parameter         |
      | countries         |
      | addingCountryIcon |

    And I enter the name and code in the text box
      | countryNametextBox | Tokyoabc |
      | countryCodeTextBox | Tok12    |

    And   I click the save button
    Then  I should see the message "Country successfully created"
