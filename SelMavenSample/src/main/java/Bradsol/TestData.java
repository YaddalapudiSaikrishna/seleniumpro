package Bradsol;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wd.util.DriverFactory;

public class TestData 
{
	static WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeClass
	public void setup()
	{
		String fpath="src/../Reports/"+this.getClass().getSimpleName()+".html";
		ExtentHtmlReporter ereport=new ExtentHtmlReporter(fpath);
		
		extent= new ExtentReports();
		extent.attachReporter(ereport);
		
		//ereport.config().getDocumentTitle();
		
		test=extent.createTest(this.getClass().getSimpleName());
		ExtentTest stest=test.createNode("setup browser");
		
        try
        {
		driver=DriverFactory.getDriverFor("chrome");
		driver.get("http://ioms.bh-in-13.webhostbox.net/login");
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		stest.log(Status.PASS, "browser opened");
        }
        catch (Exception e) 
        {
        stest.log(Status.PASS, "browser not opened");
		}
	}
	@AfterTest
	public void teardown()
	{
		ExtentTest stest=test.createNode("browser closed");
		try {
		driver.close();
		stest.log(Status.PASS, "br closed");
		}catch (Exception e) 
		{
			stest.log(Status.FAIL,"br not closed");
		}
		extent.flush();
	}
	@Test(dataProvider = "Test")
	public void login(String mail,String pwd)
	{
		ExtentTest ltest=test.createNode("login");
		try {
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(mail);

			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(pwd);

			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			System.out.println(driver.getTitle());
			ltest.log(Status.PASS, "login succes");
		
		}
		catch (Exception e) 
		{
			ltest.log(Status.FAIL, "login failed");
		}
	}


	@DataProvider
	public String[][] Test()
	{
		String t[][]=new String[2][2];
		t[0][0]="rohit.bhattad@bradsol.com";
		t[0][1]="rohit123";
		t[1][0]="rohit.bhattad@bradsol1.com";
		t[1][1]="rohit123";
		return t;
	}
}
