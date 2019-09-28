package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) 
	{   
		
		WebDriver driver=DriverFactory.getDriverFor("chrome");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	    driver.get("https://api.jquery.com/dblclick/");
	                  
		WebElement frm=  driver.findElement(By.cssSelector("div.demo code-demo,Iframe"));
		
		//go to that page 
		driver.switchTo().frame(frm);
		WebElement element=driver.findElement(By.tagName("div"));
	
	Actions A=new Actions(driver);
	        A.moveToElement(element).build().perform();
	        A.moveToElement(element).doubleClick(element).build().perform();
	}

}
