Feature: Application login


Scenario: Homepage Default login
Given User is on landing page
When User login into application with username and password
Then user will be able to verify the homepage 
And verify cards details

Scenario: Successfull login
Given User is on landing page
When User login into application with "Srijita" and "1234"
Then user will be able to verify the homepage 
And verify cards details

Scenario: UnSuccessfull login
Given User is on landing page
When User login into application with "Som" and "12344"
Then user will be able to verify the homepage 
And verify cards details

