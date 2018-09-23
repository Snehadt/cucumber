package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class AmazonHomePage extends Base{

	
	
	@FindBy(xpath=".//a[@id='nav-link-yourAccount']")
	WebElement moveToYourOrders;
	
	@FindBy(xpath=".//input[@name='email']")
	WebElement emailId;
	
	@FindBy(xpath=".//input[@type='submit']")
	WebElement username_continue;
	
	@FindBy(xpath=".//input[@type='password']")
	WebElement userPassword;
	
	@FindBy(xpath=".//input[@id='signInSubmit']")
	WebElement LoginSite;
	
	public AmazonHomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public AmazonusernamePage loginAmazon(String userId, String passwordSet) throws IOException
	{
		/*Actions actions=new Actions(driver);
		actions.moveToElement(moveToYourOrders)*/
		moveToYourOrders.click();
		emailId.clear();
		emailId.sendKeys(userId);
		username_continue.click();
		userPassword.sendKeys(passwordSet);
		LoginSite.click();
		
		return new AmazonusernamePage();
		
	}
	
	

}
