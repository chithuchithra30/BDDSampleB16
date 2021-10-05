@EndToEndTest
Feature: CRM Deal Module

@RegressionTest @SmokeTest
Scenario: Create Deal
Given User has logged
When User enters new deal details

@SmokeTest    
Scenario: Edit Deal
Given User must have logged
When User update deal details

@RegressionTest    
Scenario: View Deal
Given User must have logged
When User view deal details

@RegressionTest      
Scenario: Delete a Deal
Given User must have logged
When User deleted a deal details

  
Scenario: User has Logout
Given User has logout
    
  
