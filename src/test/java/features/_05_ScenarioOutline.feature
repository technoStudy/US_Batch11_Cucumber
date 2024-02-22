Feature: Scenario Outline

  Scenario Outline: Learning Scenario Outline
    Given a user with name "<name>" and surname "<surname>"
    When  the user is assigned and ID <id>
    And   the user makes a purchase wirth <price> dollars
    Then  the system should save the user details with User ID <user_id>
    And   the purchase record should reflect a price of <salary> dollars
    Examples:
      | name    | surname | id | price | user_id | salary  |
      | Aziza   | Khudo   | 12 | 12.5  | 11      | 1000000 |
      | Hamza   | Gokce   | 13 | 11.5  | 21      | 2000000 |
      | Hanna   | Kvitko  | 13 | 10.5  | 31      | 5000000 |
      | Tetiana | Khok    | 12 | 12.5  | 41      | 1000000 |

