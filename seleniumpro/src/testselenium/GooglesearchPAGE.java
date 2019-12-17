package testselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GooglesearchPAGE 
{  
	static WebDriver driver=null;
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=DriverFactory.getDriverFor("firefox");

		// get text present in the alert
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		System.out.println(	a.getText());
		a.accept();


		/*  // double click and right click on elements 
		 
			driver.get("http://www.ankpro.com/Account/Login");
			8374353798  WebElement ele=driver.findElement(By.linkText("Register as a new user"));
			Actions act=new Actions(driver);
			Thread.sleep(4000);
			act.contextClick((driver.findElement(By.id("RememberMe")))).build().perform();
			Thread.sleep(2000);
			act.doubleClick((driver.findElement(By.xpath("//input[@type='submit']")))).build().perform();

		 */

	}


}
