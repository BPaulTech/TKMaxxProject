package com.stepDefinitions;

import com.pages.CheckOutPage;
import cucumber.api.java.en.Then;

public class CheckOutPageStepdef {
	CheckOutPage ckOutPage=new CheckOutPage();
	
	@Then("^I should direct to checkout page$")
	public void i_should_direct_to_checkout_page() throws Throwable {
		ckOutPage.verifyCheckOutPage();
	}
	
	
}