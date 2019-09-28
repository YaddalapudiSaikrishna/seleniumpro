package testselenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

	private static Capabilities capabilities;

	public static WebDriver getDriverFor(String brName) {

		WebDriver driver = null;

		switch (brName.toLowerCase()) 
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\BrowserDrivers\\chromedriver.exe");
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\Software\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		   }
		return driver;
	}
}
	