package com.stepDefinitions;

import com.pages.SearchResultPage;

import cucumber.api.java.en.Then;

public class SearchResultStepDef {
	SearchResultPage sResultPage=new SearchResultPage();
	
	@Then("^I should see the related results$")
	public void i_should_see_the_related_results() throws Throwable {
		sResultPage.verifysearchWithValidData();
	}
	@Then("^I should see no results found$")
	public void i_should_see_no_results_found() throws Throwable {
		sResultPage.verifysearchWithInValidData();
	}

}