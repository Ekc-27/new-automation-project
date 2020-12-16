
Feature: Multiwindow

  Scenario: Opening multiple windows and closing
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click Multiple Windows
    And I click Click here
    And I closed the current tab
    Then The page titled 'Opening a new window' shall be shown
