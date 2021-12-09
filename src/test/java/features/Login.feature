Feature: OrangeHRM Login Page

Scenario: Validating the title of the page

Given : User is on Login Page
When : Title should be equal to OrangeHRM
Then : Close the browser

Scenario: Validating Login functionality

Given : User is on Login Page
When : User enters "Admin" and user enters "admin123"
And : Clicks on login button
Then : User should be on dashboard page
And : Close the browser

Scenario Outline: Validating Login functionality

Given : User is on Login Page
When : User enters <username> and user enters <password>
And : Clicks on login button
Then : User should be on dashboard page
And : Close the browser
Examples:
		|username	|password	|
		|Admin		|admin123	|
		|abc		|ace123		|
		|Admin		|admin123	|
		|user2		|pass2		|


