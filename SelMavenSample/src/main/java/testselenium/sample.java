package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class sample 
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = DriverFactory.getDriverFor("chrome");
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	@Test
	public void testcase1()
	{
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("TOM");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("JIMMY");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("eshefuheuf@gmail.com");	
        System.out.println("test1 completed");	
	}
	@Test
	public void testcase2()
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jamm");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("eshefuheuf@gmail.com");
	    System.out.println("test2 completed");
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(9000);
		driver.close();
	}
	
}
