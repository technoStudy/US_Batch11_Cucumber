Feature:US01 Login Functionality

  @SmokeTest
  Scenario: TC01 Login with valid username and password

    Given Navigate to Campus
    When  Enter username and password in the text boxes
    And   click login button
    Then  User should login successfully








