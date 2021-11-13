Feature: signIn

Scenario: customer signIn with valid data
Given I am in HomePage
When I click on signInRegister button
And I filled relevant signIn informations
And I click on signIn button
Then I should be signedIn

@smoke
Scenario: customer signIn with invalid data
Given I am in HomePage
When I click on signInRegister button
And I filled invalid signIn informations
And I click on signIn button
Then I should get the error message