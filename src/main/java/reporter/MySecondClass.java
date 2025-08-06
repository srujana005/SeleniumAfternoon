package reporter;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MySecondClass{
	
	@Test
	public void mytest1()
	{  
		
	WebDriver	driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(true);
		System.out.println("test pass");
		Reporter.log("test pass");
		String title=driver.getTitle();
		System.out.println(title);
		assertEquals(title, "Facebook – log in or sign up");
		Reporter.log("<a href=\"C:\\Users\\srujana\\eclipse-workspace\\testpractice\\myScrnShot12025_07_29_16_24_22.png\">Visit W3Schools.com!</a>");
		System.out.println("tets pass");
		
		
		
		
	}

}
