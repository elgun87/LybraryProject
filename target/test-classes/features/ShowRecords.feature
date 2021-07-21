Feature: Default Values confirming
  @verifyDefaultValues
  Scenario: Verify default values in Users page
    Given user open url "https://library2.cybertekschool.com/login.html"
    When user enter email as "librarian14@library"
    And user enter password as "87x8afWY"
    And user click on sign in button
    And user click on Users link
    When user should see show record default values as 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
