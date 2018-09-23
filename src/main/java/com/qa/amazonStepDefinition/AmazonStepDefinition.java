package com.qa.amazonStepDefinition;

import java.io.IOException;

import org.junit.Assert;

import com.qa.pages.AmazonHomePage;
import com.qa.pages.AmazonusernamePage;
import com.qa.pages.SerachPage;
import com.qa.util.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonStepDefinition extends Base{

	AmazonHomePage amazonHomepage;
	AmazonusernamePage amazonUserPage;
	SerachPage searchPage;
	public AmazonStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before
	public void setUp(){
		System.out.println("Launching");
	}
	
	@After
	
	public void tearDown(){
		System.out.println("Closing ");
	}

	@Given("^User is already on amazon page$")
	public void user_is_already_on_amazon_page(){
		Base.initialization();
	}

	//@Then("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	@Then("^User enters the username and passwords$")
	public void user_enters_the_username_and_passwords() throws Throwable   {
		amazonHomepage=new AmazonHomePage();
		//amazonHomepage.loginAmazon(uid, pass);
		amazonUserPage=amazonHomepage.loginAmazon(properties.getProperty("username"), properties.getProperty("password"));

	}

//	@Then("^validate the username is written on page$")
//	public void user_clicks_on_Sign()  {
//		boolean flag=amazonUserPage.validateUsernameS();
//		Assert.assertTrue(flag);
//
//	}
	
	@Then("^search for motog phone$")
	public void search_for_motog_phone() throws IOException {
		//searchPage=new SerachPage();
		searchPage=amazonUserPage.searchMotoGPhone(properties.getProperty("serachOrder"));
	  
	}
	
	
	@Then("^get the page title for searched page$")
	public void get_the_page_title_for_searched_page() {
		
		String actualTitle=searchPage.checkSerachPageTitle();
		//Assert.assertEquals(actualTitle, "Amazon.in: moto g5s plus mobile - Smartphones / Smartphones &amp; Basic Mobiles: Electronics");
	   
	}

	@Then("^click on desired mobile to place the order$")
	public void click_on_desired_mobile_to_place_the_order(){
		
		boolean flag=searchPage.placeOrder();
		Assert.assertTrue(flag);
	  
	}

	
	

}
