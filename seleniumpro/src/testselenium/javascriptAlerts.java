package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javascriptAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=DriverFactory.getDriverFor("firefox");
		// goto rediffmail.com
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// specify element wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		
		//alert will is displayed
		Alert a1=driver.switchTo().alert();
		
		// print the text present in alert
		String text=a1.getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		// click on ok button
		
		if(text.equalsIgnoreCase("PLEASE ENTER A VALID USER NAME"))
		{
			System.out.println("correct alert pop up");
		}
		else
		{
			System.out.println("displayed alert popup is not correct");
		}
		a1.accept();
		
	}

}
