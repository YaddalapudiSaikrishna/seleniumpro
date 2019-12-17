package testselenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandlePopUP
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();

		Set<String> handle=driver.getWindowHandles();
		System.out.println("windows size :"+handle.size());
		
		Iterator<String> it=handle.iterator();
		Thread.sleep(2000);

		String parentwindow=it.next();
		System.out.println("parentwindow popup id is :"+parentwindow);

		String childwindow=it.next();
		System.out.println("childwindow popup id is :"+childwindow);
		Thread.sleep(2000);

		driver.switchTo().window(childwindow);
		System.out.println("childwindow title is :"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println("parent window title is :"+driver.getTitle());
       
		driver.quit();

	}

}






















