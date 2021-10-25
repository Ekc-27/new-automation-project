import { Given, When, Then } from 'cypress-cucumber-preprocessor/steps';
import LearningPage from '../common/LearningPage';
import LearningPage from '../common/LearningPage';

Given('I\'m on the maximum page', () => {
    LearningPage.visitMaximum();
});

Then('I see a start-explenation-button above the template', () => {
    cy.aboveOf();
});

Then('I see a start-explenation-button below the template', () => {
    cy.belowOf();
});

When('I click on the start-explenation-button', () => {
    cy.belowOf();
});

Then('the template is scrolled to the top of the browser', () => {
    cy.topIsWithinViewport();
});

Then('the explenation is started', () => {
    cy.belowOf();
});
