Feature: Log in as librarian and verify user count
  @librarianLoginWithParametr
  Scenario: Log in as librarian same line
    Given user open url "https://library2.cybertekschool.com/login.html"
    And user enter email as "librarian12@library"
    And user enter password as "AOYKYTMJ"
    And user click on sign in button
    Then user can view "Test Librarian 12" dashboard
    Then user there would be 5572 users