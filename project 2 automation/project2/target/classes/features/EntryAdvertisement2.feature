Feature: Entry Advertisement

  Scenario: Entry Advertisement page and closing the modal
    Given that I go to the Chrome browser.
    When I type in the url http://51.11.162.64:443/
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click on 'Entry Ad'
    And I click Close on 'THIS IS A MODAL WINDOW' modal
    And I click the dropdown
    And I select 'Option 2' 
    Then 'Option 2' shall be shown as selected on the dropdown 
