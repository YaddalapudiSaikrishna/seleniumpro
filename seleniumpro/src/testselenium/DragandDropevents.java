package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropevents 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=DriverFactory.getDriverFor("chrome");	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().window().maximize();
	 Thread.sleep(3000);	
	 driver.get("https://jqueryui.com/droppable/");
	 driver.switchTo().frame(0); 
	 
	 Actions action=new Actions(driver);
     action.clickAndHold(driver.findElement(By.id("draggable")));
action.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	
	}

}
