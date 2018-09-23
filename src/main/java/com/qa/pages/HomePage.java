package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class HomePage extends Base{

	
	@FindBy(xpath=".//*[contains(.,'Naveen K')]")
	WebElement loginUserHome;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String checkPageTitle()
	{
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	 public boolean loggedInUserValidation()
	 {
		 return loginUserHome.isDisplayed();
	 }
	
}
