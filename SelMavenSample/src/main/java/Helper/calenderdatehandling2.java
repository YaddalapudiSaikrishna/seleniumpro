package Helper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class calenderdatehandling2 
{
	@Test
	public void Datehandling() throws InterruptedException
	{
		WebDriver driver =DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		Thread.sleep(3000);
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr[5]/td"));
		int pickdate=dates.size();
		
		for(int i=1;i<pickdate;i++)
		{
			String today=dates.get(i).getText();
			if(today.equalsIgnoreCase("27"))
			{
				System.out.println(dates.get(i).getText());
				dates.get(i).click();
				System.out.println("tesk is complete date selected");
				break;
			}
		}
		
	}
}
