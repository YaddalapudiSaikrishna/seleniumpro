package Helper;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.wd.util.DriverFactory;

public class BrowserFactory 
{
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriver driver =DriverFactory.getDriverFor("chrome");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriver driver =DriverFactory.getDriverFor("firefox");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
}
