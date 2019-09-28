package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Empcalender {

	public static void main(String[] args) 
	{
		   WebDriver driver=DriverFactory.getDriverFor("chrome");
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    
		    driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
		    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		    
		    driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
	}

}
