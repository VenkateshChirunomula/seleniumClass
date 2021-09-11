package seleniumClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {
	
	static WebDriver browser ;
	@BeforeTest
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		 browser = new ChromeDriver();
		browser.get("https://opensource-demo.orangehrmlive.com/");
		
		browser.manage().window().maximize();
	}
	@Test //annotation
	public void userlogin() throws InterruptedException
	{
		//1. user should open orangehrm webpage.
		//2. user should enter username and password 
		//3. click on submit 
		
		
		//4. validate somethingto ensure user logged in.

	
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//1. need to know the locator 
		//user name -- //input[@id='txtUsername']
		//password -- //input[@id='txtPassword']
		//submit -- //input[@id='btnLogin']
		
		browser.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		browser.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		browser.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	
		
		String expectedUrl = "https://opensource--demo.orangehrmlive.com/index.php/dashboard";
		
		String actualurl = browser.getCurrentUrl();
		
		assertEquals(actualurl, expectedUrl);
		System.out.println(actualurl);
		
		//welcome -- //a[@id='welcome']
		//logout -- //*[text()='Logout']
		
		
	}
	@AfterTest
	public void logout()
	{
		browser.findElement(By.xpath("//a[@id='welcome']")).click();
		browser.findElement(By.xpath("//*[text()='Logout']")).click();
		browser.close();
		
	}



}
