package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickwithoutusingclickmethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());	
		// changing the webpage title by using javascriptExecutor	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    String title =(String)executor.executeScript("document.title = 'my orange'");
	    System.out.println(driver.getTitle());*/

		int a=15;
		int b=20;
		int c=45;
		int x=a+b;
		int y=a-b;
		int z=a+b+c;
		System.out.println(x+" "+y+" "+z);
	}	

}










