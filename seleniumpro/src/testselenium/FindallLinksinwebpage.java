package testselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindallLinksinwebpage {

	public static void main(String[] args) 
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		
		driver.get("https://www.amazon.in/");
		String data=driver.getTitle();
		System.out.println(data);
		
		
		List<WebElement> links=driver.findElements(By.tagName("img"));
	    for(int i=0;i<links.size()-1;i++)
	    {
	    	WebDriverWait wait= new WebDriverWait(driver,10);
	        wait.until(ExpectedConditions.titleContains(data));
	        System.out.println(i+"--"+links.get(i).getAttribute("alt"));
	    }
	}

}
