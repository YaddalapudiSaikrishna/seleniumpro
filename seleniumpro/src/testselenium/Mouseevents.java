package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseevents {

	public static void main(String[] args) 
	{
	
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIpvDZ1tms5QIVxhwrCh2ekQ3BEAAYASAAEgI9d_D_BwE");
	    driver.manage().window().maximize();
	    Actions action=new Actions(driver);
	    action.doubleClick(driver.findElement(By.cssSelector("[class='manageHeaderLbl']"))).build().perform();
        String Title=driver.getTitle();
        System.out.println(Title);*/
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
.build()
.perform();
	act.click(driver.findElement(By.xpath("//span[text()='Edit']"))).build().perform();
driver.switchTo().alert().accept();

	
	 
	}
}
