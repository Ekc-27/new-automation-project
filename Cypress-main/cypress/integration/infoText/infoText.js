import { Given, Then } from 'cypress-cucumber-preprocessor/steps';
import LearningPage from '../common/LearningPage';
import fixture from '../fixtures/example.json'

const requiredExample = require('../../fixtures/example')

Given('I\'m on the maximum page', () => {
    LearningPage.visitMaximum();
});




    Then('The Info-Text is ending in {string}', (page) => {
        describe('Login to OrangeHRM website', function () {
            before(function () {
                
                cy.fixture('example').then(function (example) {
                    this.example = example
                })
            })
        
            it('Validate Text Present', function () {
                
                cy.get('#xpath').contains(this.testdata.TextDisplay)
            })
        })
});


