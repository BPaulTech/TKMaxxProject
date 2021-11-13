package com.stepDefinitions;

import com.pages.ProductPage;

import cucumber.api.java.en.When;

public class ProductPageStepDef {
	ProductPage prodPage=new ProductPage();
	
	@When("^I select the quantity$")
	public void i_select_the_quantity() throws Throwable {
		prodPage.selectPrdctQntyForCkOut();
	}
	@When("^I add the item to basket$")
	public void i_add_the_item_to_basket() throws Throwable {
		prodPage.addItemToBsktForCkOut();
	}
	@When("^I should see the item added to basket$")
	public void i_should_see_the_item_added_to_basket() throws Throwable {
		prodPage.itemAddedToShoppingBag();
	}

	@When("^I click on checkout$")
	public void i_click_on_checkout() throws Throwable {
		prodPage.clickCheckoutButton();
	}
}