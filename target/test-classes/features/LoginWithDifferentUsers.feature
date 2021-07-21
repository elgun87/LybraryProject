Feature: Data driven testing with different user accounts

  Background:
    Given user open url "https://library2.cybertekschool.com/login.html"

  @studentLoginWithDifferentCredentials
  Scenario Outline: Log in with different as "<name>"
    When user enter email as "<studentEmail>"
    And user enter password as "<studentPassword>"
    And user click on sign in button
    Then user can view "<name>" dashboard

    Examples:
      | studentEmail      | studentPassword | name            |
      | student11@library | tScBPCUr        | Test Student 11 |
      | student12@library | UC0LC9Hj        | Test Student 12 |
      | student13@library | zcVbvUWH        | Test Student 13 |
      | student14@library | 6SW236ia        | Test Student 14 |
      | student15@library | Tt6UFxnY        | Test Student 15 |
      | student16@library | VNKw282v        | Test Student 16 |

  @librarianLoginWithDifferentCredentials
  Scenario Outline: Log in with different as "<name>"
    When user enter email as "<librarianEmail>"
    And user enter password as "<librarianPassword>"
    And user click on sign in button
    Then user can view "<name>" dashboard

    Examples:
      | librarianEmail      | librarianPassword | name              |
      | librarian43@library | np6AxVIh          | Test Librarian 43 |
      | librarian44@library | 4Lzovksn          | Test Librarian 44 |
      | librarian45@library | KD9Wvogf          | Test Librarian 45 |
      | librarian46@library | YiDR3nCQ          | Test Librarian 46 |
      | librarian47@library | rJEIrUIt          | Test Librarian 47 |
      | librarian48@library | LB8QnOmU          | Test Librarian 48 |