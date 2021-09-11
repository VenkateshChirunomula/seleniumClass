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

public class AdminTest {

	static WebDriver browser ;
	@BeforeTest
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.get("https://opensource-demo.orangehrmlive.com/");

		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//1. need to know the locator 
		//user name -- //input[@id='txtUsername']
		//password -- //input[@id='txtPassword']
		//submit -- //input[@id='btnLogin']

		browser.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		browser.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		browser.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@Test
	public void admintest()
	{
		browser.findElement(By.xpath("//b[text()='Admin']")).click();
		browser.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("Nina.Patel");
		browser.findElement(By.xpath("//input[@name='_search']")).click();
		
		String expected = "NinaPatel";
		String actual = browser.findElement(By.xpath("//*[text()='Nina.Patel']")).getText(); 
		assertEquals(actual, expected);
	
	}
	@AfterTest
	public void logout()
	{
		browser.findElement(By.xpath("//a[@id='welcome']")).click();
		browser.findElement(By.xpath("//*[text()='Logout']")).click();
		browser.close();
		
	}

}
