package prlleltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parlel1 {
	@Test
	@Parameters(value="browser")
	public void test1(String browser) throws InterruptedException
	{ 
	
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			 driver.navigate().refresh();
			 driver.get("https://www.fb.com");	 
			 driver.navigate().refresh();
			    driver.findElement(By.id("email")).sendKeys("srujna");
			    driver.findElement(By.id("pass")).sendKeys("sujji");
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@name='login']")).click();
		
		}
		else if(browser.equals("edge"))
		{
			//🔗 https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
			System.setProperty("webdriver.edge.driver" ,"C:\\Users\\srujana\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.fb.com");
				driver.navigate().refresh();
				Thread.sleep(5000);
			    driver.findElement(By.id("email")).sendKeys("srujna");
				Thread.sleep(5000);
			    driver.findElement(By.id("pass")).sendKeys("sujji");
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@name='login']")).click();
		}
	   
	   driver.get("https://www.fb.com");	   
	}

}



