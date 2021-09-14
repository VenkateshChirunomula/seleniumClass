package seleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindelementsUsingList extends BaseTest {

	@Test
	public void list()
	{
		List<WebElement>  li = browser.findElements(By.tagName("a"));
		
		System.out.println(li.size());
		for (WebElement ele : li) {
			System.out.println(ele.getText());
		}
	}

}
