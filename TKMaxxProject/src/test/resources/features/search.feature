Feature: search

@ticket001
Scenario: search with valid data
Given I am in HomePage
When I search for a valid product
Then I should see the related results

Scenario: search with Invalid data
Given I am in HomePage
When I search for a invalid product
Then I should see no results found