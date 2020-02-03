package TestNgbasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testselenium.DriverFactory;

public class tng_parallelTesting_02
{
	WebDriver driver;
	@Parameters("BrowserName")	 
	@Test
	public void setup(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=DriverFactory.getDriverFor("chrome");
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver=DriverFactory.getDriverFor("firefox");
		}
		System.out.println("site opened on :"+BrowserName);
	}
	@Test
	public void test1()
	{
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}





