package com.wd.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportswithTestNG 
{
	ExtentHtmlReporter htmlreport;
	ExtentReports extentreport;
	ExtentTest test1;
	WebDriver driver;

	@BeforeTest
	public void setuptest()
	{	
		htmlreport=new ExtentHtmlReporter("C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\test-output\\firsttest.html");

		ExtentReports extentreport=new ExtentReports();
		extentreport.attachReporter(htmlreport);	
		System.out.println("browser started");
		extentreport.setSystemInfo("saikrishna","QA");
		test1=extentreport.createTest("check the redbus calender "," check dates are selected or not"); 
	}
	@Test
	public void test1() 
	{
		WebDriver driver =DriverFactory.getDriverFor("chrome"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.redbus.in/");		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();	
		List<WebElement> date=driver.findElements(By.xpath("//div[@class='rb-calendar']//tr[7]//td"));

		int dates=date.size();
		for(int i=1;i<dates;i++)
		{
			String pick=date.get(i).getText();
			if(pick.equalsIgnoreCase("30"))
			{   
				System.out.println(date.get(i).getText());
				date.get(i).click();
				break;
			}
		}

		driver.quit();
	}
}










