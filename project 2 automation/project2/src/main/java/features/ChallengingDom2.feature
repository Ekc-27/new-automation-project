
Feature: Page Challanging DOM

  Scenario: Opening challanging DOM page
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click Challenging DOM
    Then The page titled 'Challenging DOM' shall be shown with tables and rows
    And the value 'Definiebas2' shall be shown under the column 'Sit'  
    And the value 'Consequuntur6' shall be shown under the column 'Amet'  
    And the value 'Consequuntur7' shall be shown under the column 'Amet'  
