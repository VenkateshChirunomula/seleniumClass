package seleniumClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	
	static WebDriver driver;
//	public static void main(String[] args) {
//		openEbay();
//		searchProduct();
//	}
	
	@BeforeTest
	public void openEbay()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void registration()
	{
		driver.findElement(By.linkText("Registration")).click();
		
		assertEquals("You eBay account | eBay", driver.getTitle());
		
		if (driver.findElement(By.id("gh-title")).getText().equalsIgnoreCase("Customer Service")) {
			System.out.println("element is present");
		}
		else {
			System.err.println("element not available");
		}
		if (driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("You eBay account")) {
			System.out.println("element is present");
		}
		else {
			System.err.println("element not available");
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
