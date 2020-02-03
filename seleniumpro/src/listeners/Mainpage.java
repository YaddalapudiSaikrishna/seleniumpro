package listeners;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class Mainpage extends Base
{
	static WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		intialization();
	}
	@Test
	public void HandlingAlerts()
	{
		Actions act=new Actions(driver);
		Alert a=driver.switchTo().alert();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
	    driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert();
		a.accept();	
		driver.quit();
		/*driver.findElement(By.xpath("//a[text()='Deposit']")).click();
		driver.findElement(By.name("accountno")).sendKeys("3347828052");
		driver.findElement(By.name("ammount")).sendKeys("100000");
		driver.findElement(By.name("desc")).sendKeys("first month");
		driver.findElement(By.name("AccSubmit")).click();*/
	}
	@Test
	public void HandlingFrames()
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Frames']"))).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement f=driver.findElement(By.id("Multiple"));
		//iframe[@style='float: left;height: 300px;width:600px']
		driver.switchTo().frame(f);
		driver.quit();

		/* driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.name("name")).sendKeys("shenell");
		driver.findElement(By.name("city")).sendKeys("newzland");
		driver.findElement(By.name("state")).sendKeys("southdc");	
		driver.findElement(By.name("sub")).click(); */
	}
}














