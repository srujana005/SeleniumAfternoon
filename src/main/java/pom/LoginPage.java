package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1. WebElements : @FindBy : -> PageFactory.init(driver,this);
	//2. Actions/Methods
	
	//3. Constructor
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement email;
	public void enterEmail(String user)
	{
		email.sendKeys(user);
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
		//Assert x 
	}
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}

}
