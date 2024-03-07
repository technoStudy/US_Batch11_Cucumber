Feature: ApachePOI Citizen Functionality


  Background:Login and Creating Citizenship
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully
    When  I click the Setup button
    And   I click the Parameters button
    And   I click the Citizenship button

  Scenario: Create and delete citizenship from excel
      When  I create citizenship with ApachePOI
      Then  I should see the "Citizenship successfully created" message
      Then  I delete citizenship with ApachePOI
