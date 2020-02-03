package testselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class APSrtcONLINE 
{
	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("hyderabad");
		driver.findElement(By.linkText("HYDERABAD")).click();
		driver.findElement(By.cssSelector("#toPlaceName")).sendKeys("tirupathi");
		driver.findElement(By.linkText("TIRUPATHI")).click();  
		driver.findElement(By.cssSelector("#txtJourneyDate")).click();	
	    driver.findElement(By.xpath("//a[text()='17']")).click(); 
		driver.findElement(By.cssSelector("#searchBtn")).click();
		
		List<WebElement> allser=driver.findElements(By.xpath("//div[@class='srvceNO']"));
		int all=allser.size();
		System.out.println("Buses available in APS RTC :"+all);
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#BtFid")).click();
		driver.findElement(By.xpath("//span[normalize-space()='NON A/C CLASS']")).click(); // non a/c buses
	//	driver.findElement(By.xpath("//span[normalize-space()='A/C CLASS']")).click();    // a/c buses 
		
		
		List<WebElement> acBuses=driver.findElements(By.xpath("//div[@class='srvceNO']"));
		int count=1;
		for(int i=0;i<acBuses.size();i++)
		{
			if(acBuses.get(i).isDisplayed())
			{
			System.out.println(count+".BUS NUMBER : "+acBuses.get(i).getText());
			count++;
			}
		}
	}
}








