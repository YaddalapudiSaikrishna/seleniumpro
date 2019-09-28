package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jdk.jshell.Diag;               //div[@class='profile-menu icon icon-account']

public class WorkingwFrames 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = DriverFactory.getDriverFor("chrome");
	   
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	   // go to  red bus site
	   driver.get("https://www.redbus.in/?gclid=CjwKCAjw1_PqBRBIEiwA71rmtVrIHJS_4liuIqPeMyz8hA-cBYE_3RUeN-jFb68769-q3IbUos96VhoCpUoQAvD_BwE");
	   
	   driver.findElement(By.xpath("//[@class='site-links gtm-hotels']")).click();
	   
	   driver.findElement(By.xpath("//div[@class='profile-menu icon icon-account']")).click();
	  
	   driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
	  
	   driver.findElement(By.xpath("//button[text()='No Thanks']")).click();

	   WebElement frm=driver.findElement(By.cssSelector("iframe.modalIframe"));
	   driver.switchTo().frame(frm);
	
	   driver.findElement(By.id("//*[@id='mobileNoInp']")).sendKeys("7780642035");
}
}
