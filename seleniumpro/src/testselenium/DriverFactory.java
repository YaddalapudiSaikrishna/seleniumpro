package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverFactory 
{
	//private static Capabilities capabilities;

	public static WebDriver getDriverFor(String brName) 
	{
		WebDriver driver = null;
		switch (brName.toLowerCase()) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Drivers\\chromedriver_new\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\Drivers\\Firefox\\geckodriver.exe");
			FirefoxOptions fo= new FirefoxOptions();
			fo.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver(fo);
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\Drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		   }
		return driver;
	}
}
	