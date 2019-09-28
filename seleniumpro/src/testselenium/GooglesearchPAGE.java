package testselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglesearchPAGE 
{  
	static WebDriver driver=null;
		public static void main(String[] args) throws Exception 
		{
			WebDriver driver=DriverFactory.getDriverFor("chrome");
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sai");
		    List <WebElement> alloptions=driver.findElements(By.xpath("//span[text()='sai']"));
		    for(int i=0;i<alloptions.size();i++)
		    {
		    	String title;
		    	 System.out.println(title=alloptions.get(i).getText());	    
			}
		  	   	
		}
}
