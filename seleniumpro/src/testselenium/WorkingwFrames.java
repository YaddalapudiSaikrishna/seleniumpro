package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 //div[@class='profile-menu icon icon-account']

public class WorkingwFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gclid=CjwKCAjw1_PqBRBIEiwA71rmtVrIHJS_4liuIqPeMyz8hA-cBYE_3RUeN-jFb68769-q3IbUos96VhoCpUoQAvD_BwE");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='HOTELS ']")).click();
		driver.findElement(By.xpath("//div[@class='profile-menu icon icon-account']")).click();
		
		driver.findElement(By.xpath("//li[text()='SignIn / SignUp']")).click();
		driver.findElement(By.xpath("//button[text()='No Thanks']")).click();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);		
		driver.findElement(By.cssSelector("input#mobileNoInp")).sendKeys("7780642035");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}
}
