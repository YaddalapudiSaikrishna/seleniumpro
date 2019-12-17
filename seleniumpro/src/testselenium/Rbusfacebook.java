package testselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rbusfacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gclid=CjwKCAjw1_PqBRBIEiwA71rmtVrIHJS_4liuIqPeMyz8hA-cBYE_3RUeN-jFb68769-q3IbUos96VhoCpUoQAvD_BwE");		   
		driver.findElement(By.xpath("//a[@class='site-links gtm-hotels']")).click();
        int ele=driver.findElements(By.tagName("a")).size();
        System.out.println("links present in the webpage :"+ele);
        driver.findElement(By.xpath("//div[@class='profile-menu icon icon-account']")).click();
		driver.findElement(By.xpath("//li[text()='SignIn / SignUp']")).click();

		WebElement frame=driver.findElement(By.cssSelector("iframe.modalIframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);	   
		driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();
		Thread.sleep(1000);
		Set<String> wnhandles=driver.getWindowHandles();
		for(String wnd:wnhandles)
		{
			System.out.println("window id is :"+wnd);
			driver.switchTo().window(wnd);
			if(driver.getTitle().startsWith("Facebook"))
			{
				break;
			}
		}
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.close();
		driver.quit();
	}
}



















