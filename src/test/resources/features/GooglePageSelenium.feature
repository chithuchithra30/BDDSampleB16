Feature: Google Page Search
This feature is for verifying google page

Scenario: Search Selenium Tutorial
Given I launch Google Page
When I search Selenium Tutorial
Then Should display Selenium result page
And Close the browser