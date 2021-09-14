package seleniumClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

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
	

}
