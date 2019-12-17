package listeners;
import org.testng.annotations.Test;

import testselenium.DriverFactory;

import org.testng.annotations.BeforeMethod;
import java.util.List;import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TSRTCBUS 
{
	WebDriver driver=null;
	@BeforeMethod
	public void openbrowser() 
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver(); 	
	}
	@Test
	public void setup()
	{
		driver.get("https://www.tsrtconline.in/oprs-web/"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.id("searchBtn")).click();

		Alert a1=driver.switchTo().alert();
		if(a1.getText().equalsIgnoreCase("please select start :"))
		{
			System.out.println("..ok..");
		}
		a1.accept();

		String splace="HYDERABAD";
		String tplace="TIRUPATHI";

		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("srvceNO")));
		driver.findElement(By.xpath("//*[@name='fromPlaceName']")).sendKeys(splace);
		driver.findElement(By.linkText(splace)).click();
		driver.findElement(By.xpath("//*[@name='toPlaceName']")).sendKeys(tplace);
		driver.findElement(By.linkText(tplace)).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("30")).click();
        driver.findElement(By.id("searchBtn")).click();
	}

	@AfterMethod
	public void closebroswer()
	{
		List<WebElement> lstserv =driver.findElements(By.className("srvceNO"));
		for(int i=0;i<lstserv.size();i++)
		{
			System.out.println(lstserv.get(i).getText());;
		}
		for(WebElement service:lstserv)
		{
			System.out.println(service.getText());
		}
		driver.close();
	}

}
