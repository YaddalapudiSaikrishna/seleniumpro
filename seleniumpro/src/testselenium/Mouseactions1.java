package testselenium;

import java.util.concurrent.TimeUnit;

import org.ghost4j.GhostscriptLibrary.display_callback_s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions1 
{
	public static void main(String[] args) 
	{   
		// goto chrome
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		// wait onesec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// goto to the jquery link
        driver.get("https://api.jquery.com/dblclick/");

WebElement elm = driver.findElement(By.linkText("Contribute"));
     
       // see the mouse actions to start here
       Actions act = new Actions(driver);
               act.moveToElement(elm).build().perform();
               act.click(driver.findElement(By.linkText("Documentation"))).build().perform();
               driver.findElement(By.xpath("//a[@id='getting-involved']")).click();
               String s=driver.getTitle();
               System.out.println(s);
    }
}