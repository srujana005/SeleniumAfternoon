package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	WebDriver driver;
	FacebookLoginPage fb;
	@BeforeTest
	public void setUp()
	{
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  fb=new FacebookLoginPage(driver);
	}
	
	@Test
	public void loginTest1()
	{
	 fb.enterEmail("helo@gmail.com");
	 fb.enterPassword("abcde");
	}

}
