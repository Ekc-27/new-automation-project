

Feature: Logging out functionality 

  Scenario: Logging in an account
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click Logout
    Then I have logged out of the account and the login page shall be displayed.

