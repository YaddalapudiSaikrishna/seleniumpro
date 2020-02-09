package Bradsol;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wd.util.DriverFactory;

public class Bradsol_TC_ExtentReport_01 
{  
	WebDriver driver=null;
	ExtentReports extent;
	ExtentTest test;
	@BeforeClass
	public void OpenApplication()
	{
		extent=new ExtentReports();
		String fpath="src/../Reports/"+this.getClass().getSimpleName()+".html";

		ExtentHtmlReporter ehtml=new ExtentHtmlReporter(fpath);
		extent.attachReporter(ehtml);
		test=extent.createTest(this.getClass().getSimpleName());

		driver=DriverFactory.getDriverFor("chrome");
		driver.get("http://ioms.bh-in-13.webhostbox.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.quit();
		extent.flush();
	}
	@Test(priority = 1)
	public void Loginpage()
	{
		ExtentTest Ltest=test.createNode("login page");
		try {
			driver.findElement(By.name("email")).sendKeys("rohit.bhattad@bradsol.com");
			driver.findElement(By.name("password")).sendKeys("rohit123");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			System.out.println("Loginpage :"+driver.getTitle());
			Ltest.log(Status.PASS, "Application opened");
		}
		catch (Exception e) 
		{
			Ltest.log(Status.FAIL, "Application failed to opened");
		}
	}
	@Test(dependsOnMethods ="Loginpage")
	public void Homepage()
	{ 
		ExtentTest Htest=test.createNode("Home page");
		try
		{
			driver.findElement(By.xpath("//span[text()='Purchase']")).click();
			driver.findElement(By.xpath("//span[text()='Purchases']")).click();
			driver.findElement(By.linkText("New Purchase Order")).click();
			System.out.println("Homepage :"+driver.getTitle());
			Htest.log(Status.PASS, "Homepage is adding new puchase");
		}
		catch (Exception e) 
		{
			Htest.log(Status.FAIL, "Home page not adding purchase");
		}

	}
	@Test(priority = 2)
	public void AddNewPurchase() throws InterruptedException
	{
		ExtentTest Htest=test.createNode("Add new purchase");
		try
		{
			driver.findElement(By.id("po_reference_no")).sendKeys("143143");
			WebElement supplier=driver.findElement(By.xpath("//label[@class='require control-label']/parent::div//child::select[@id='cus']"));
			Select s=new Select(supplier);
			s.selectByVisibleText("Tata TMT");

			System.out.println("Newpurchase page :"+driver.getTitle());
			WebElement location=driver.findElement(By.xpath("//label[@class='require control-label']/parent::div//child::select[@id='loc']"));
			Select l=new Select(location);
			l.selectByVisibleText("Begumpet");

			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//table[@class='table table-condensed']//tr[3]/td[4]")).click();
			driver.findElement(By.id("expected_delivery_date")).click();
			driver.findElement(By.xpath("//table[@class='table table-condensed']//tr[3]/td[7]")).click();

			WebElement co=driver.findElement(By.name("co_number"));
			co.sendKeys("100117");

			WebElement cus=driver.findElement(By.xpath("//label[@for='exampleInputEmail1']/parent::div//child::select[@id='customer']"));
			Select c=new Select(cus);
			c.selectByVisibleText("Priya");

			driver.findElement(By.cssSelector("input#payment_days")).sendKeys("15");
			driver.findElement(By.cssSelector("#search")).sendKeys("Paper");
			driver.findElement(By.xpath("//li[text()='Paper']")).click();
			driver.findElement(By.name("comments")).sendKeys("good Quality");
			driver.findElement(By.name("price[]")).sendKeys("1500");
			driver.findElement(By.id("custPrice_231")).sendKeys("1300");
			driver.findElement(By.id("btnSubmit")).click();
			Thread.sleep(3000);
			Htest.log(Status.PASS, "added new purchase data");
		}
		catch (Exception e) 
		{
			Htest.log(Status.FAIL, "not Add the NewPurchase data ");
		}
	}
	@Test(priority = 3)
	public void SearchPO()
	{
		ExtentTest Stest=test.createNode("SearchPO");
		try
		{
			driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("100117");
			driver.findElement(By.xpath("//a[text()='143143']")).click();
			System.out.println("serachPo :"+driver.getTitle());
			test.log(Status.PASS, "searched data based on PO");		
		}
		catch (Exception e) 
		{
			Stest.log(Status.FAIL, "not searching data based on PO");
		}
	}
	@Test(priority = 4)
	public void EditPO()
	{
		ExtentTest Etest=test.createNode("EditPO");
		try
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.name("comments")).clear();
			driver.findElement(By.name("comments")).sendKeys("product is good ");
			System.out.println("EditPo :"+driver.getTitle());
			driver.findElement(By.id("btnSubmit")).click();
			Etest.log(Status.PASS, "Edited PO");

		}
		catch (Exception e) {
			Etest.log(Status.FAIL, "not Edit PO");
		}
	}
}

