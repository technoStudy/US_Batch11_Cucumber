Feature: Campus Citizenship Addition

  #Background: You use the keyword Background at the beginning of a feature file
  # followwed by the steps that need to be executed before each scenario
 # Background like a Before method in the TestNG
  Background:
    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully


  Scenario: TC01 Adding a new citizenship successfully
    When  I click the Setup button
    And   I click the Parameters button
    And   I click the Citizenship button
    And   I click add the citizenship icon
    And   I enter "FromXyzdsad" in the name text box
    And   I enter "xyz123ab12" in the shortname text box
    And   I click on the save button
    Then  I should see the "Citizenship successfully created" message


  Scenario: TC02 Check the existing citizenship
    When  I click the Setup button
    And   I click the Parameters button
    And   I click the Citizenship button
    And   I click add the citizenship icon
    And   I enter "FromXyzdsad" in the name text box
    And   I enter "xyz123ab12" in the shortname text box
    And   I click on the save button
   # Then  I should see the "FromXyzdsad" citizen is created

