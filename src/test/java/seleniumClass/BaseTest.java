package seleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static  WebDriver browser;
	@SuppressWarnings("deprecation")
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
	@AfterTest
	public void logout()
	{
		browser.findElement(By.xpath("//a[@id='welcome']")).click();
		browser.findElement(By.xpath("//*[text()='Logout']")).click();
		browser.close();
		
	}
}
