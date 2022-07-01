package com.StepDefination;

import BaseLayer.BaseClasssys;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilsLayer.Screenshot;

public class RegisterPageTest extends BaseClasssys {
	@Given("User On Register Page")
	public void user_on_register_page() {
		BaseClasssys.initialization();
	  
	}
	@When("User Enter {string}, {string}, {string}, and {string}")
	public void user_enter_and(String compayName, String emailId, String passWord, String confirmPassword)
	{
	 RegisterPage register = new RegisterPage();   
	 register.registerNewUser(compayName, emailId, passWord, confirmPassword);
	 Screenshot.takeScreenshot();
	 
	}
	@Then("User On HomePage")
	public void user_on_home_page() {
		Screenshot.takeScreenshot();
		
		
	   
	}

}
