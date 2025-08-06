package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataPro1 {
	
	// 1. Admin1 password1
	// 2. Admin2 password2
	// 3. Admin3 password3
	
	@Test(dataProvider="mydata",dataProviderClass=MyDataProviders.class)
	public void test1(String user,String pass)
	{
		System.out.println("open chrome");
		WebDriver d=new  ChromeDriver();
		d.manage().window().maximize();
	    System.out.println("go to login page");
	    d.get("https://www.facebook.com/login/");
	    d.navigate().refresh();
	    
	    System.out.println("Enter usrername as "+user);
	    d.findElement(By.id("email")).sendKeys(user);
	    System.out.println("Enter password as "+pass);
	    d.findElement(By.id("pass")).sendKeys(pass);
	    System.out.println("Click on Login ");
	    d.findElement(By.id("loginbutton")).click();
	    System.out.println("--------------------------------------");
	}
	@Test(dataProvider="login",dataProviderClass=MyDataProviders.class)
	public void test2(String user,String pass)
	{
		System.out.println("open chrome");
		WebDriver d=new  ChromeDriver();
		d.manage().window().maximize();
	    System.out.println("go to login page");
	    d.get("https://practice.expandtesting.com/login");
	    d.navigate().refresh();
	    
	    System.out.println("Enter usrername as "+user);
	    d.findElement(By.id("username")).sendKeys(user);
	    System.out.println("Enter password as "+pass);
	    d.findElement(By.id("password")).sendKeys(pass);
	    System.out.println("Click on Login ");
	    d.findElement(By.id("loginbutton")).click();
	    System.out.println("--------------------------------------");
	}
	
	
}
	