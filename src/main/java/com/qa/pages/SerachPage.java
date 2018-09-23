package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class SerachPage extends Base{

	public SerachPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(.//*[contains(text(),'Moto G5s Plus')])[1]")
	WebElement motoPhone;
	
	
	@FindBy(xpath="(.//input[@id='add-to-cart-button'])")
	WebElement addToCart;
	public String checkSerachPageTitle(){
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	
	public boolean placeOrder(){
		motoPhone.click();
		addToCart.click();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(".//i[@role='img']"));
		act.moveToElement(ele).build().perform();
		
		return motoPhone.isDisplayed();
		
		
		
		}
	}
