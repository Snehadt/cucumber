package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class AmazonusernamePage extends Base{

	public AmazonusernamePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[contains(text(),'Hello, Sneha')]")
	WebElement validateUserName;
	
	@FindBy(xpath=".//input[@id='twotabsearchtextbox']")
	WebElement searchBar;
	
	public boolean validateUsernameS(){
		//String text=validateUserName.getText();
		return validateUserName.isDisplayed();
		
	}
	
	public SerachPage searchMotoGPhone(String searchOrder) throws IOException{
		searchBar.sendKeys(searchOrder);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		//searchBar.click();
		return new SerachPage();
		
		
	}

}
