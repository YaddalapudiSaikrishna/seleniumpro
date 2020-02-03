package testselenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UsingRobotClass 
{
	public static void main(String[] args) throws Exception
	{

		WebDriver driver =DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://filebin.net/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fileField']")).sendKeys("C:\\Users\\ADMIN\\Downloads\\LSN RESUME.docx");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String filepath="C:\\Users\\ADMIN\\Downloads\\LSN RESUME.docx";

		Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(new  StringSelection(filepath),null);

		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
