package listners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyLitstener.class)
public class MySecondClass extends Base{
	
	@Test
	public void mytest1()
	{  
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String tit=driver.getTitle();
		assertEquals(tit, "fvb");	
		
	}
	@Test
	public void mytest2()
	{  
		
		driver=new ChromeDriver();
		driver.get("https://www.practiceexpn.com");
		String tit=driver.getTitle();
		assertEquals(tit, "fvb");	
		
	}

}
