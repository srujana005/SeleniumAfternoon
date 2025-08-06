package fileupld;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table2 {
	
	@Test()
	public void test1() {

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://practice.expandtesting.com/dynamic-table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));

	for (int i = 1; i <= rows.size(); i++) {
	    List<WebElement> columns = driver.findElements(By.xpath("//tbody/tr[" + i + "]/td"));
	    
	    for (int j = 1; j <= columns.size(); j++) {
	        String rc = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText();
	        System.out.print(rc + "  ");
	        
			/*
			 * if (rc.equals("SystemABC")) { System.out.print(" <-- It is present"); }
			 */
	    }
	    System.out.println();
	}

	}

}
