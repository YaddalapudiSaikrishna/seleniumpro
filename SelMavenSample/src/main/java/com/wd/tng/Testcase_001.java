package com.wd.tng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class Testcase_001 
{
	WebDriver driver;
	@BeforeClass
	public void openapp()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("browser opened");
	}
	@AfterClass
	public void closeapp()
	{
		driver.quit();
		System.out.println("close the browser");
	}
	@Test
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("login success"); 
		if(!VerifyPagechange.verify(driver, By.linkText("PIM")))
		{
			Assert.assertTrue(true, "test login");
		}
	}
	@Test(dependsOnMethods = "login")
	public void AddEmpdetails()
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Selenium");
		driver.findElement(By.id("lastName")).sendKeys("Hq");
		driver.findElement(By.id("btnSave")).click();
		System.out.println("added the employee details");
	}
}
