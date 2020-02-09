package POM_TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.wd.util.DriverFactory;

public class SetupBrowser 
{
	WebDriver driver;
	public void openApplication() 
	{
	driver=DriverFactory.getDriverFor("chrome");
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	}
	public void closeApplication()
	{
		driver.close();
	}
   
}
