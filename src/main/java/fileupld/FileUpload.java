package fileupld;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void fileUp() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.file.io/");
		
		//location  : C:\Users\Admin\OneDrive\Desktop\newFoler\My216Project\AiMl.txt;
	  WebElement ele=driver.findElement(By.id("select-files-input"));
      Thread.sleep(5000);
	  ele.sendKeys("C:\\Users\\srujana\\OneDrive\\Desktop\\File.txt.txt");
	  Thread.sleep(5000);
	  
	}

}
