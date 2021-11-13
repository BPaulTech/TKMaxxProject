Feature: basket

Scenario: add item to basket
Given I am in HomePage
When I search for a valid item
And I select the quantity
And I add the item to basket
And I should see the item added to basket
And I click on checkout
Then I should direct to checkout page