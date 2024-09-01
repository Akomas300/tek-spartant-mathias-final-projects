Feature: Navigate to Customer Service Portal with valid CSR credentials
  Background:
    When user click on login link
    When user enter "supervisor" and "tek_supervisor" to signIn
    Then user click on "Sign In" button
    Then validate user in "Customer Service Portal" page
    When user click on "Accounts" link
  @Scenario1
  Scenario: navigate to Accounts verify 5 row page is default
    Then user validate 5 row page is displayed
    @Scenario2
    Scenario: navigate to Accounts change show per page to 10, 25, 50 and
    validate table records per page according to selected show per page
      When wait for 1000 ms
      When user change show per page to 10
      When wait for 1000 ms
      Then user validate 10 row page is displayed
      When wait for 1000 ms
      When user change show per page to 25
      When wait for 1000 ms
      Then user validate 25 row page is displayed
      When wait for 1000 ms
      When user change show per page to 50
      When wait for 1000 ms
      Then user validate 50 row page is displayed

