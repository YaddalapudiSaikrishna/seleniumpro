package testselenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APSRTCOnlineWindow 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#i-icon-profile")).click();
		driver.findElement(By.xpath("//*[text()='Sign In/Sign Up']")).click();
		Thread.sleep(5000);
		
		// switch control to frame
		WebElement frame=driver.findElement(By.cssSelector("iframe.modalIframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Facebook']")).click();
		String mainwindow=driver.getWindowHandle();
		switchwindow(driver, "facebook");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("FacebookSign@gmail.com");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(mainwindow);
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Google']")).click();
		switchwindow(driver, "Sign in – Google accounts");
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("googleSign@gmail.com");
		Thread.sleep(3000);
		driver.close();
		driver.quit();

    	}
	public static void switchwindow(WebDriver driver,String exceptedwindow)
	{
	   Set<String> windowid=driver.getWindowHandles();
		for(String handle:windowid)
		{
			//System.out.println("window ids"+handle);
			driver.switchTo().window(handle);
			String title=driver.getTitle(); System.out.println(title);
			if(title.contains(exceptedwindow))
			{
				
				System.out.println("window founded"); break;
			}
		}	
		
		
	}

}






