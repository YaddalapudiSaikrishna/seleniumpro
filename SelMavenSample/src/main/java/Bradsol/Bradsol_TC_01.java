package Bradsol;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.wd.util.DriverFactory;
public class Bradsol_TC_01 
{  
	WebDriver driver=null;
	@BeforeTest
	public void setup()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.get("http://ioms.bh-in-13.webhostbox.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	@Test(priority = 1)
	public void Loginpage()
	{
		driver.findElement(By.name("email")).sendKeys("rohit.bhattad@bradsol.com");
		driver.findElement(By.name("password")).sendKeys("rohit123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Reporter.log("login successfully");
		System.out.println("Loginpage :"+driver.getTitle());
	}
	@Test(dependsOnMethods ="Loginpage")
	public void Homepage()
	{
		driver.findElement(By.xpath("//span[text()='Purchase']")).click();
		driver.findElement(By.xpath("//span[text()='Purchases']")).click();
		driver.findElement(By.linkText("New Purchase Order")).click();
		System.out.println("Homepage :"+driver.getTitle());
	}
	@Test(priority = 2)
	public void AddNewPurchase() throws InterruptedException
	{
		driver.findElement(By.id("po_reference_no")).sendKeys("253794");
		WebElement supplier=driver.findElement(By.xpath("//label[@class='require control-label']/parent::div//child::select[@id='cus']"));
		Select s=new Select(supplier);
		s.selectByVisibleText("Tata TMT");

		System.out.println("Newpurchase page :"+driver.getTitle());
		WebElement location=driver.findElement(By.xpath("//label[@class='require control-label']/parent::div//child::select[@id='loc']"));
		Select l=new Select(location);
		l.selectByVisibleText("Begumpet");

		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//table[@class='table table-condensed']//tr[3]/td[5]")).click();
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

	}
	@Test(priority = 3)
	public void SearchPO()
	{
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//table[@class='table table-condensed']//tr[3]/td[5]")).click();

		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//table[@class='table table-condensed']//tr[3]/td[7]")).click();

		driver.findElement(By.xpath("//a[text()='253794']")).click();
		System.out.println("serachPo :"+driver.getTitle());
	}
	@Test(priority = 4)
	public void EditPO()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("product is good ");
		System.out.println("EditPo :"+driver.getTitle());
		driver.findElement(By.id("btnSubmit")).click();
	}
}

