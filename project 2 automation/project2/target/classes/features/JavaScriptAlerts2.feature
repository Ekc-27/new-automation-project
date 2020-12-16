
Feature: JavaScript Alerts

  Scenario: Clicking the JavaScript alerts
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click JavaScript Alerts
    And I click 'Click for JS Alert'
    And I click 'OK'
    And I click 'Click for JS Confirm'
    And I click 'Cancel'
    And I click 'Click for JS Prompt'
    And I type in the JavaScript alert section 'check1'
    And I am clicking 'OK' 
    Then The page shall show the message 'You entered: check1'

