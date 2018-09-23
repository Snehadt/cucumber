package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ContactStepDefinition {
	
	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();


	}

	@When("^title of login page is Fre CRM$")
	public void title_of_login_page_is_Fre_CRM()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Userclicks on login button$")
	public void userclicks_on_login_button() throws Throwable {
		WebElement loginBtn =
				driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^User is in home page$")
	public void user_is_in_Home_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	
	@Then("^user mouse hovers on new contact$")
	public void user_mouse_hovers_on_new_contact() throws Throwable {
		Thread.sleep(2000);
		int size=driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		WebElement mainframe=driver.findElement(By.xpath(".//html//following::frame[@name='mainpanel']"));
	    driver.switchTo().frame(mainframe);
	    Actions action =new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^User adds \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and clicks on save$")
	public void user_adds_and_and_and_clicks_on_save(String firstname, String lastname, String position) throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	    
	}

}
