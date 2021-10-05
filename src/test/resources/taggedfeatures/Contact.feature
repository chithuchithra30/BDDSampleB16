@FunctionalTest
Feature: CRM Contact Module

Background: Valid Login
Given User must have logged


#@RegressionTest @SmokeTest
Scenario: Create Contact
#Given User must have logged
When User enters new contact details

@SmokeTest    
Scenario: Edit Contact
Given User must have logged
When User update contact details

@RegressionTest    
Scenario: View Contact
Given User must have logged
When User view contact details
    
Scenario: Delete a Contact
Given User must have logged
When User deleted a contact details

@RegressionTest    
Scenario: User Logout
Given User logout
    
  
