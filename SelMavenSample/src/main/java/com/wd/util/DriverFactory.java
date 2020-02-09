package com.wd.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
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
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Drivers\\gecko-Firefox\\geckodriver.exe");
			// fo.addPreference("dom.webnotifications.enabled", false);
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
