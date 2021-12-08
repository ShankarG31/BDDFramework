Feature: OrangeHRM Login Page

Scenario: Validating the title of the page

Given : User is on Login Page
When : Title should be equal to OrangeHRM
Then : Close the browser

Scenario: Validating Login functionality

Given : User is on Login Page
When : User enters username and user enters password
And : Clicks on login button
Then : User should be on dashboard page
And : Close the browser