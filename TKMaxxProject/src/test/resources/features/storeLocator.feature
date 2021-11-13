Feature: storeLocator

Scenario: search with valid postcode
Given I am in HomePage
And I select store locator link
And I enter valid postcode
When I click on search button
Then I should see the related stores

Scenario: search with invalid postcode
Given I am in HomePage
And I select store locator link
And I enter invalid postcode
When I click on search button
Then I should see no stores found