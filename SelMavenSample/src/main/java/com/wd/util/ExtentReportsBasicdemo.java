package com.wd.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicdemo 
{
	static WebDriver driver=null;

	public static void main(String[] args) 
	{
		ExtentHtmlReporter	htmlreport=new ExtentHtmlReporter("reports.html");
		ExtentReports	extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		ExtentTest test= extent.createTest("search the data in google ","test the functionality of google search");

		WebDriver driver =DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		test.log(Status.PASS,"navigate to googlecom");
		driver.manage().window().maximize();
		test.log(Status.PASS, "maximize the window");
		driver.findElement(By.name("q")).sendKeys("saikrishna");
		test.log(Status.PASS,"enter the data to search");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.log(Status.PASS,"click on the search button ");
		test.log(Status.INFO,"test is completed");

		extent.flush();
		driver.close();
	}


}
