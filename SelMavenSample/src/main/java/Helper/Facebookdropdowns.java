package Helper;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.wd.util.DriverFactory;

public class Facebookdropdowns
{
public static void main(String[] args)
	{
	WebDriver driver =DriverFactory.getDriverFor("chrome");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	
	WebElement daydropdown=driver.findElement(By.cssSelector("select#day"));
	WebElement yeardropdown=driver.findElement(By.cssSelector("select#year"));
	WebElement monthdropdown=driver.findElement(By.cssSelector("select#month"));
	
	Select day=new Select(daydropdown);
	Select year=new Select(yeardropdown);
	Select month=new Select(monthdropdown);

	day.selectByIndex(21);
	year.selectByValue("2000");
	month.selectByVisibleText("Aug");
	
	}
}
