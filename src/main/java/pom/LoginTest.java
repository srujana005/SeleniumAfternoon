package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		lp=new LoginPage(driver);
	}
	
	@Test
	public void loginTest1()
	{
		lp.enterEmail("myemail@gmail.com");
		lp.enterPassword("mypassword");
		lp.clickOnLoginBtn();
		//Assert ..
	}
	// cntrl + ? = //
	// cntrl + shift + o = organize imports 
	// cntrl + shift + f= format my code
	
	@Test
	public void loginTest2()
	{
		lp.enterEmail("makd@gmail.com");
		lp.enterPassword("mypassword");
		lp.clickOnLoginBtn();
		//Assert.assertTrue(..);
	}


}
