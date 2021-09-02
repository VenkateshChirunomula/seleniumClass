package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	static WebDriver driver;
	public static void openUrl()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://gmail.com");
		
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void enterUsername()
	{
		driver.findElement(By.id("identifierId")).sendKeys("venkateshchiruomula");
		driver.findElement(By.xpath("(//*[contains(text(),'Create account')])[2]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//*[contains(text(),'To manage my business')])[2]")).click(); //
	}
	public static void pageAssertion()
	{
		
		
		
		String actualpageTitle = "GMail";
		
		String expectedpageTitle = driver.getTitle();
		
		if (actualpageTitle.equals(expectedpageTitle)) {
			System.out.println("Titles matched");
		} else {
			System.err.println("Titles mis match");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		openUrl();
		maximize();
		pageAssertion();
		enterUsername();
	}
}
