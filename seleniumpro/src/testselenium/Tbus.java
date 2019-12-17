package testselenium;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tbus 
{ 
public static void main(String[] args) throws InterruptedException 
{
		
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("searchBtn")).click();
	    
	    Alert a1=driver.switchTo().alert();
	    if(a1.getText().equalsIgnoreCase("please select start :"))
	    {
	    	System.out.println("..ok..");
	    }
	    a1.accept();
	    
	    String splace="HYDERABAD";
	    String tplace="TIRUPATHI";
	    
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='srvceNO']")));
	    
	    driver.findElement(By.xpath("//*[@name='fromPlaceName']")).sendKeys(splace);
	    driver.findElement(By.linkText(splace)).click();
	    driver.findElement(By.xpath("//*[@name='toPlaceName']")).sendKeys(tplace);
	    driver.findElement(By.linkText(tplace)).click();
	    driver.findElement(By.id("txtJourneyDate")).click();
	    driver.findElement(By.linkText("30")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("searchBtn")).click();
	    
	    List<WebElement> lstserv =driver.findElements(By.xpath("//div[@class='srvceNO']"));
	    for(int i=0;i<lstserv.size();i++)
	     {
	     	System.out.println(lstserv.get(i).getText());;
	     }
	    for(WebElement service:lstserv)
	    {
	    	System.out.println(service.getText());
	    }
	  
	}
}
