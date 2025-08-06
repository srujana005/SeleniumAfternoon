package prlleltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {
	@Test
	@Parameters(value="browser")
	public void test1(String browser) throws InterruptedException
	{ 
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practice.expandtesting.com/login");
			driver.findElement(By.id("username")).sendKeys("practice");
			driver.findElement(By.id("username")).sendKeys("user123");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver" ,"C:\\Users\\srujana\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();driver.get("https://practice.expandtesting.com/login");
			driver.findElement(By.id("username")).sendKeys("practice");
			Thread.sleep(5000);
			driver.findElement(By.id("username")).sendKeys("user123");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
	   
	   driver.get("https://www.fb.com");	   
	}

}


