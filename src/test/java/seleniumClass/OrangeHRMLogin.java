package seleniumClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OrangeHRMLogin extends BaseTest {
	
	
	@Test //annotation
	public void userlogin() throws InterruptedException
	{
		//1. user should open orangehrm webpage.
		//2. user should enter username and password 
		//3. click on submit 
		
		
		//4. validate somethingto ensure user logged in.

	
		String expectedUrl = "https://opensource--demo.orangehrmlive.com/index.php/dashboard";
		
		String actualurl = browser.getCurrentUrl();
		
		assertEquals(actualurl, expectedUrl);
		System.out.println(actualurl);
		
		//welcome -- //a[@id='welcome']
		//logout -- //*[text()='Logout']
		
		
	}
	

}
