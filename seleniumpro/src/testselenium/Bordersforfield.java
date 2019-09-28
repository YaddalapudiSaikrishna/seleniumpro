package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;

public class Bordersforfield 
{
	 public static void main(String[] args) throws InterruptedException, FindFailed
	 {
		   WebDriver driver=DriverFactory.getDriverFor("chrome");
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    
		    WebElement elm= driver.findElement(By.xpath("//*[@name='txtUsername']"));
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    
		    js.executeScript("arguments[0].style.border = 'thick solid #0000FF';", elm);
		    elm.sendKeys("admin");
		    
		   // driver.findElement(By.xpath("//*[@id='txtPassword']"));
 js.executeScript("document.getElementById('txtPassword').style.border ='thick solid #0000FF';document.getElementById('txtPassword').value='admin123';");

			// click on login
			WebElement login = (WebElement) js.executeScript("document.getElementById('btnLogin').style.border ='thick solid #0000FF';return document.getElementById('btnLogin');");
			login.click();

		 
	 }
		  
}
