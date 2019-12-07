package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;

public class LoginPage extends ProjectSpecificMethods {
	
	@Given("Enter the username as (.*)")
	public LoginPage enterUsername(String username) {
		clearAndType(locateElement("id", "username"), username);
		return this;
	}

	@Given("Enter the Password as (.*)")
	public LoginPage enterPassword(String password) {
		clearAndType(locateElement("id", "password"), password);
		return this;
	}

	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
}
