package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage  {
  
	WebDriver driver;
	By email=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@id='pass']");
	By login=By.xpath("//button[@name='login']");
	
	public FacebookLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String e)
	{
		WebElement ele=driver.findElement(email);
		ele.sendKeys(e);
	}
	
	public void enterPassword(String p)
	{
		driver.findElement(password).sendKeys(p);
	}
	
	
	

}
