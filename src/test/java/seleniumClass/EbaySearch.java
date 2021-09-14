package seleniumClass;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class EbaySearch {
	
	static WebDriver driver;
	
	@BeforeTest
	public void openEbay()
	{
		WebDriverManager.edgedriver().browserVersion("92").setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void clickDailyDeals() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.className("(gh-p)[1]")).click();
		List<WebElement> ele = driver.findElements(By.className("gh-p"));
		Iterator<WebElement> i = ele.iterator();
		while(i.hasNext())
		{
			System.out.println(ele);
			break;
			
		}
		Thread.sleep(3000);
	}
	@Test(enabled = false)
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
