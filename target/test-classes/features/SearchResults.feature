Feature: As a user, I should be able to login as librarian. When I go to Users page, table should have following columns:
  •Actions•UserID•Full Name•Email•Group•Status

  Scenario: Verfiy Serach Result Colums Headers
    Given user open url "https://library2.cybertekschool.com/login.html"
    When user enter email as "librarian14@library"
    And user enter password as "87x8afWY"
    And user click on sign in button
    When user click on Users link
    Then user can view User Managment Table Headers as:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
