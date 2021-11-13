package com.stepDefinitions;

import com.pages.StoreLocatorPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreLocatorPageStepDef {
	StoreLocatorPage storeLocPage=new StoreLocatorPage();
	
	@Given("^I enter valid postcode$")
	public void i_enter_valid_postcode() throws Throwable {
		storeLocPage.enterValidPostcode();
	}
	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
		storeLocPage.clickStoreSearchButton();
	}
	
	@Then("^I should see the related stores$")
	public void i_should_see_the_related_stores() throws Throwable {
		storeLocPage.storesValidPostcode();
	}
	
	@Given("^I enter invalid postcode$")
	public void i_enter_invalid_postcode() throws Throwable {
		storeLocPage.enterInValidPostcode();
	}

	@Then("^I should see no stores found$")
	public void i_should_see_no_stores_found() throws Throwable {
		storeLocPage.errorMessageInvalidPostcode();
	}

}