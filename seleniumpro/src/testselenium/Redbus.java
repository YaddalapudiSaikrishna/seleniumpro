package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Redbus 
{
	public static void main(String[] args) 
	{
		// go to chrome browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// go to redbus site
		driver.get("https://www.redbus.in/?gclid=CjwKCAjw1_PqBRBIEiwA71rmtVrIHJS_4liuIqPeMyz8hA-cBYE_3RUeN-jFb68769-q3IbUos96VhoCpUoQAvD_BwE");

		//  select onward date calender open
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		boolean monthFound=false;
		while(!monthFound)
		{      

			String mTitle=driver.findElement(By.cssSelector("#rb-calender_onward_cal td.monthTitle")).getText();

			if(mTitle.equalsIgnoreCase("Dec 2019"))
			{
				driver.findElement(By.xpath("//div[@id='rb-calender_onward_cal']//td[text()='20']")).click();
				monthFound=true;
			}
			else
			{
				driver.findElement(By.cssSelector("#rb-calender_onward_cal td.next button")).click();
			}
		}
		WebElement so= driver.findElement(By.xpath("//label[@class='db text-trans-uc move-up']"));

		System.out.println(so);
	}

}
