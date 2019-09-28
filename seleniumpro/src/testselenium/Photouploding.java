package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Photouploding 
{
   public static void main(String[] args) throws InterruptedException, FindFailed {
	   WebDriver driver=DriverFactory.getDriverFor("chrome");
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
	  
	    driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
	  
	    driver.findElement(By.xpath("//*[@name='empsearch[termination]']"));
	    driver.findElement(By.xpath("//*[@name='btnAdd']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sai");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("krishna");
	    driver.findElement(By.id("photofile")).click();
	    
	    String fpath="C:\\hqdefault.jpg";
	    
	    Screen scr = new Screen();
	    scr.type("C:\\Capture1.JPG", fpath);
	    Thread.sleep(1000);
	    scr.click("C:\\Capture2.JPG");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	    
	 
}
}
