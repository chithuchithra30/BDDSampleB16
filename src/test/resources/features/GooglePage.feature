Feature: Google Page Search
This feature is for verifying google page

Scenario: Search Java Tutorial
Given I launch Google Page
When I search Java Tutorial
#Then display java result page
Then Should display Java result page
#And Browser should be closed
And Close the browser

Scenario: Search Cucumber Tutorial
Given I launch Google Page
When I search Cucumber Tutorial
Then Should display Cucumber result page
And Close the browser