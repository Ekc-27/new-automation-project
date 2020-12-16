
Feature: Basic Inputs


  Scenario: Inserting data in the Inputs page 
    Given that I go to the Chrome browser.
    When I type in the url 'http://51.11.162.64:443/'
    And I type in username section 'admin'
    And I type in password section 'bluebird'
    And I click Login
    And I click Inputs
    And I click Submit
    And I tick Yes 
    And I type in 29 in the age section
    And I type in Banana in the fruits section
    And I type in a wrong email adress testtest.com 
    And I type in a short message 'Test message'
    And I click submit 
    And I change the email to the correct format test@test.com 
    And I click submit 
    Then The message shall be sent 
    And All areas shall be empty again 
