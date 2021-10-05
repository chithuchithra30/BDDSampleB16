Feature: CRM Login Feature
This feature is to test login functionality

#Scenario: Valid Login
#Given User is already in login page
#When User enters login credentials
#Then User is on Home page
#And Browser is closed

#Scenario: Valid Login
#Given User is already in login page
#When User enters "corpdevops@gmail.com" and "CrmPro123"
#Then User is on Home page
#And Browser is closed

#Scenario Outline: Valid Login
#Given User is already in login page
#When User enters "<username>" and "<password>"
#Then User is on Home page
#And Browser is closed
#
#Examples:
#	| username | password |
#	| corpdevops@gmail.com| CrmPro123 |
#	| testuser1 | Welcome123 |
	
	
#Scenario: Valid Login
#Given User is already in login page
#When User enters login credentials
#	| corpdevops@gmail.com| CrmPro123 |
#Then User is on Home page
#And Browser is closed


Scenario: Valid Login
Given User is already in login page
When User enters login credentials
	| username | password |
	| corpdevops@gmail.com| CrmPro123 |
Then User is on Home page
And Browser is closed