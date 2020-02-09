package Helper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class CalenderDataHandling 
{
	public static void main(String[] args) 
	{
		WebDriver driver =DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		List<WebElement> date=driver.findElements(By.xpath("//div[@class='rb-calendar']//tr[7]//td"));
		int dates=date.size();
		// System.out.println(dates);
		for(int i=1;i<dates;i++)
		{
			String pick=date.get(i).getText();
			if(pick.equalsIgnoreCase("30"))
			{   
				System.out.println(date.get(i).getText());
				date.get(i).click();
				break;
			}
		}
	}
}
