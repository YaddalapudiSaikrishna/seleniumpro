package Loggers_log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class readingDEMOproperties 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\src\\main\\java\\testselenium\\Demo.properties");
		p.load(fis);
		String browsername=p.getProperty("Browser");
		System.out.println(browsername);

		String url=p.getProperty("url");
		System.out.println(url);

		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver =DriverFactory.getDriverFor("chrome");
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
		    driver =DriverFactory.getDriverFor("firefox");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id(p.getProperty("username_id"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.id(p.getProperty("password_id"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("login_button")).click();
	}
}





















