package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;

	@Given("open chrome")
	public void openChrome() {
		driver = new ChromeDriver();
	}

	@When("user enters url")
	public void enterUrl() {
		driver.get("https://practice.expandtesting.com/login");
	}

	
	  @When("user enters username as practice") 
	  public void enterUsername() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
	  }
	 

	@When("user enters password as SuperSecretPassword!")
	public void user_enters_password_as_super_secret_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("click on login");
		// driver.findElement(by.xpth(..)).click();
	}

	@Then("user is redirected to homepage")
	public void user_is_redirected_to_homepage() {
		System.out.println("User is on homepage");

//		String actTitle = driver.getTitle();
//		String expTitle = "......";
//		Assert.assertEquals(actTitle,expTitle);

	}

}