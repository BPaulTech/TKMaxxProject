package com.stepDefinitions;

import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef {
	HomePage homePage=new HomePage();
	
	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() throws Throwable {
		homePage.verifyHomePage();
	}

	@When("^I search for a valid item$")
	public void i_search_for_a_valid_item() throws Throwable {
		homePage.searchWithValidProductForChkOut();
		
	}
	@When("^I click on signInRegister button$")
	public void i_click_on_signInRegister_button() throws Throwable {
		homePage.clickOnSignInRegisterButton();
	}
	@When("^I search for a valid product$")
	public void i_search_for_a_valid_product() throws Throwable {
		homePage.searchWithValidData();
	}
	@When("^I search for a invalid product$")
	public void i_search_for_a_invalid_product() throws Throwable {
		homePage.searchWithInvalidData();

	}
	@Given("^I select store locator link$")
	public void i_select_store_locator_link() throws Throwable {
		homePage.clickOnStoreLocator();
}
	
	
}
