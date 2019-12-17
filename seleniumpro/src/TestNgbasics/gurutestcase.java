 package TestNgbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testselenium.DriverFactory;

public class gurutestcase 
{
	WebDriver driver=null;
	
	@BeforeTest
	public void setup()
	   {
		WebDriver driver=DriverFactory.getDriverFor("chrome");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.demo.guru99.com/v4/");
        driver.manage().window().maximize();
	   }
	
	@Test
	public void searchpage()
	  {
		
		driver.findElement(By.name("uid")).sendKeys("mngr222234");
        driver.findElement(By.name("password")).sendKeys("semyqag");
        driver.findElement(By.name("btnLogin")).click();
		System.out.println("successfully");
	 }
	@AfterTest
	public void closewindow()
	    {
		  driver.close();
	    }
}







