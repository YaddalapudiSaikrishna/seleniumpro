package com.wd.tng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class ParallelTC 
{
	WebDriver driver;
	@Parameters({"brName"})
	@BeforeTest
	public void setup(String brName) throws InterruptedException
	{
		driver=DriverFactory.getDriverFor(brName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	@Test
	public void test()
	{
		driver.get("https://testng.org/doc/");
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
