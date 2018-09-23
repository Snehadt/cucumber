package com.qa.FeeCRMStepDefinition;

import java.io.IOException;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends Base {
	
	LoginPage loginPage;
	HomePage homePage;
	public HomePageSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   Base.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage=new LoginPage();
		String actualTitle=loginPage.checkPageTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", actualTitle);
	    
	}

	@Then("^user enters credentials and logs into application$")
	public void user_enters_username_and_password() throws Throwable {
		
		homePage=loginPage.loginValidation(properties.getProperty("username"), properties.getProperty("password"));
		
	   
	}

	
	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {

		String homePageTitle=homePage.checkPageTitle();
		Assert.assertEquals("CRMPRO", homePageTitle);

	}

	

//	@Then("^validate logged in user name$")
//	public void validate_logged_in_user_name() throws Throwable {
//		boolean flag=homePage.loggedInUserValidation();
//		Assert.assertTrue(flag);
//	   
//	}

}
