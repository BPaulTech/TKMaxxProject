package com.stepDefinitions;

import com.pages.RegisterSignInPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSignInPageStepDef {
	RegisterSignInPage regSignPage=new RegisterSignInPage();
	
	
	@When("^I filled relevant register informations$")
	public void i_filled_relevant_register_informations() throws Throwable {
		regSignPage.fillRegisterInformations();
	}
	
	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
		regSignPage.clickRegisterButton();
	}
	@Then("^I should be registered$")
	public void i_should_be_registered() throws Throwable {
		regSignPage.verifyRegistration();
	}
	@When("^I filled relevant signIn informations$")
	public void i_filled_relevant_signIn_informations() throws Throwable {
		regSignPage.fillValidSignInformations();
	}
	@When("^I filled invalid signIn informations$")
	public void i_filled_invalid_signIn_informations() throws Throwable {
		regSignPage.fillInValidSignInformations();
	}
	@When("^I click on signIn button$")
	public void i_click_on_signIn_button() throws Throwable {
		regSignPage.clickSignInButton();
	}
	@Then("^I should be signedIn$")
	public void i_should_be_signedIn() throws Throwable {
		regSignPage.verifySignedIn();
	}
	@Then("^I should get the error message$")
	public void i_should_get_the_error_message() throws Throwable {
		regSignPage.verifySignInErrorMessage();
	
	}

	
}