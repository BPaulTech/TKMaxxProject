Feature: register

Scenario: register as a new customer
Given I am in HomePage
When I click on signInRegister button
And I filled relevant register informations
And I click on register button
Then I should be registered