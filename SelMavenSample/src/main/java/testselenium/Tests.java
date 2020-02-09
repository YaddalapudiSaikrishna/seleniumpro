package testselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class Tests 
{
	WebDriver driver;
	@BeforeMethod
	public void bm()
	{
		System.out.println(" login app ");
	}
	@AfterMethod
	public void am()
	{
		System.out.println(" close app ");
	}
	@BeforeClass
	public void bc()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("open browser");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("data entered");

	}
	@Test
	public void test2()
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Emp")).click();
		System.out.println("store data");
	}
	@AfterClass
	public void ac()
	{
		driver.quit();
		System.out.println("close browser");
	}


}
