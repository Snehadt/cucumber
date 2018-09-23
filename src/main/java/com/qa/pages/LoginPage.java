package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class LoginPage extends Base{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath=".//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath=".//*[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath=".//button[contais(text(),'Sign up')]")
	WebElement signUp;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String checkPageTitle()
	{
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	
	public HomePage loginValidation(String uid,String pass) throws IOException, InterruptedException{
		username.clear();
		username.sendKeys(uid);
		password.clear();
		password.sendKeys(pass);
		
		Thread.sleep(2000);
		loginBtn.click();
		
		return new HomePage();
	}

}
