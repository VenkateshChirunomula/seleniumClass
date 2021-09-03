package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbaySearch {
	
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
	public void searchProduct()
	{
		driver.findElement(By.id("gh-ac")).sendKeys("Portrait");
			
		new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Art");
		
		driver.findElement(By.id("gh-btn")).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
