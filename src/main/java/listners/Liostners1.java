package listners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyLitstener.class)
public class Liostners1 extends Base{
	@Test()
	public void mytest1()
	{  
		driver=new ChromeDriver();
		driver.get("https://www..com");
		Reporter.log("title");
		driver.navigate().refresh();
		Assert.assertTrue(true);
	}
	

}
