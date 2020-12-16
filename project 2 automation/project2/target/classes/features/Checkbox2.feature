
Feature: Checkbox page

  Scenario: Toggling through checkboxes 
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click Checkboxes
    And I untick 'checkbox 2'
    And I tick 'checkbox 1'
    And I refresh the page
    Then The checkboxes shall go back to default where 'checkbox 1' is unticked and 'checkbox 2' is ticked

