Feature: DataTable Examples

  Scenario: User List
    When I write username "Mehmet"
    And  I write username and password "mehmet" and "12345"
    And  I write usernames as DataTable
      | Aziza   |
      | Hamza   |
      | Polina  |
      | Oguzhan |
      | Sahin   |
      | Samet   |
      | Tatiana |
      | Aliye   |

    And I write username and password as DataTable
      | Aziza   | 123    |
      | Hamza   | 3214   |
      | Polina  | 46611  |
      | Oguzhan | 4545   |
      | Sahin   | 544545 |
      | Samet   | 0000   |
      | Tatiana | 12345  |
      | Aliye   | 45698  |

