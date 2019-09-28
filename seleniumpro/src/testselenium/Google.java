package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google 
{
	 public static void main(String[] args) throws InterruptedException 
	 {			
		  // open browser
				WebDriver driver = DriverFactory.getDriverFor("chrome");

				// wait for page load
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

				// wait for element
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// navigate to redbus site
				driver.get("https://www.redbus.in/");
				
				driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
				

				boolean monthFound = false;
				while (!monthFound) {
					String mTitle = driver.findElement
							(By.cssSelector("#rb-calendar_onward_cal td.monthTitle")).getText();
					if (mTitle.equalsIgnoreCase("Dec 2019")) {
						driver.findElement(
								By.xpath("//div[@id='rb-calendar_onward_cal']//td[text()='20']")).click();
						monthFound=true;
					} else {
						driver.findElement(
								By.cssSelector("#rb-calendar_onward_cal td.next button")).click();
					}
				}
			}
	 }

