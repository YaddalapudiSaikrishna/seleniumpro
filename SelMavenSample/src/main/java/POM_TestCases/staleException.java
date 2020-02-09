package POM_TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class staleException 
{
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException 
{
	driver=DriverFactory.getDriverFor("chrome");
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	WebElement us=driver.findElement(By.id("txtUsername"));
	us.sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.navigate().refresh();
	driver.navigate().back();
	us.sendKeys("Admin");
	
}
}
