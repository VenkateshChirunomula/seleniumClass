package seleniumClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EmployeeTest extends BaseTest{
	
	@Test
	public void employeeInfo() throws InterruptedException
	{
		browser.findElement(By.id("menu_pim_viewPimModule")).click();
		browser.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Odis");
		
		// select class 
		List<WebElement> li = browser.findElements(By.xpath("//*[@id=\"empsearch_job_title\"]/option"));
		
		System.out.println(li.size());
		for (WebElement ele : li) {
			System.out.println(ele.getText());
		}
		
		
		Select s = new Select(browser.findElement(By.name("empsearch[job_title]")));
		s.selectByValue("3");
		
		browser.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		
		String actual = browser.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
		
		System.out.println(actual);
		
		assertEquals("Odiss", actual);
		System.out.println(actual);
	
	
	}

}
