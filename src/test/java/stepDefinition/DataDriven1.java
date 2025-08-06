package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataDriven1 {
	
	
	WebDriver driver;
	
	//Execute before for each scenario
		@Before(order=1)
		public void setUp()
		{
		  System.out.println("Before 1");	
		}
		@Before(order=2)
		public void setUp2()
		{
		  System.out.println("Before 2");	
		}
	@Given("user opens the browser")
	public void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	}

	@When("user enter url")
	public void user_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
//	System.out.println("#############");
//	//driver.get(...);
		driver.get("https://practice.expandtesting.com/login");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String user) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	}

	@When("user enters passwrod as {string}")
	public void user_enters_passwrod_as(String pass) {
   //1234 
		// ...
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	}

	@When("users clicks on login button")
	public void users_clicks_on_login_button() {
		System.out.println("Login sucessfully");
	}
	



}

