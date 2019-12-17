package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Photouploding 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		WebDriver driver=DriverFactory.getDriverFor("firefox");

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement att=driver.findElement(By.xpath("//*[@name='txtUsername']"));
		att.sendKeys("Admin");
		String at= att.getAttribute("value");
		System.out.println("value is :"+at);

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();

		driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a#menu_pim_addEmployee")).click();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("sai");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("krishna");

		driver.findElement(By.id("photofile")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String fpath="C:\\hqdefault.jpg";

		Screen scr = new Screen();
		scr.type("C:\\Capture100.JPG", fpath);
		Thread.sleep(1000);
		scr.click("C:\\Capture101.JPG");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='btnSave']")).click();


	}
}
