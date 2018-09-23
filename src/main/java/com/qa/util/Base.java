package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.crm.qa.utils.utility;

public class Base {
	public static WebDriver driver;
	public static Properties properties;

	public Base() throws IOException
	{

		properties=new Properties();
		//WebDriver driver;
		FileInputStream fileinput=new FileInputStream("D:\\demoMavenWorkspace\\FreeCRMProject_Cucumber\\src\\main\\java\\com\\qa\\config\\config.properties");
		properties.load(fileinput);

	}
	public static void initialization(){

		String browserName=properties.getProperty("browser");

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\AppiumReqdSOftware\\AppiumReqdSOftware\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.implicitTimeOut, TimeUnit.SECONDS);
		 driver.get(properties.getProperty("url"));

	}

}
