package listners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyLitstener.class)
public class Listenersss extends Base {
	
	@Test()
	public void mytest1()
	{  
		driver=new ChromeDriver();
		driver.get("https://www..com");
		driver.navigate().refresh();
		Assert.assertTrue(true);
	}
	@Test()
	public void mytest2()
	{  
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "gle");
	}
	@Test()
	public void mytest3()
	{  
String s="srujaba";
assertEquals(s, "sujji");
	}
	

}
