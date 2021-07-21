@login
Feature: Log in

  Background:
    When user open url "https://library2.cybertekschool.com/login.html"

  Scenario Outline: Log in as a "<name>"
    And user enter email as "<studentEmail>"
    And user enter password as "<studentPassword>"
    And user click on sign in button
    Then user can view "<name>" dashboard

    Examples:
      | studentEmail      | studentPassword | name            |
      | student14@library | 6SW236ia        | Test Student 14 |

  Scenario Outline: Log in as a "<name>"
    And user enter email as "<librarianEmail>"
    And user enter password as "<librarianPassword>"
    And user click on sign in button
    Then user can view "<name>" dashboard

    Examples:
      | librarianEmail      | librarianPassword | name              |
      | librarian14@library | 87x8afWY          | Test Librarian 14 |