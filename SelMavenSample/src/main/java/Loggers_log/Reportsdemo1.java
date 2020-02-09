package Loggers_log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.wd.util.DriverFactory;

public class Reportsdemo1
{
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void setup()
	{
		htmlreporter=new ExtentHtmlReporter("demo.html");
		htmlreporter.config().setDocumentTitle("Automation test");
		htmlreporter.config().setReportName("functional test");
		htmlreporter.config().setTheme(Theme.DARK);

		extent=new ExtentReports();
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("OS", "Window10");
		extent.setSystemInfo("TesterName", "saikrishna");
		extent.setSystemInfo("Browser", "chrome");
	}
	@BeforeMethod
	public void setup1()
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	@Test(priority = 1)
	public void LoginPage()
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("TOM");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("JIMMY");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("eshefuheuf@gmail.com");
	}
	@Test(priority = 2)
	public void HomePage()
	{
		boolean img= driver.findElement(By.cssSelector("img#imagetrgt")).isDisplayed();
		System.out.println(img);
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual,"Register");
	}
	@AfterMethod
	public void endtest(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed"+result.getName()+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.FAIL, "test case failed"+result.getName()+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.STARTED)
		{
			test.log(Status.INFO, "test case failed"+result.getName()+result.getThrowable());
		}
	}
	@AfterTest
	public void endreport()
	{
		extent.flush();
		driver.close();
	}
}
