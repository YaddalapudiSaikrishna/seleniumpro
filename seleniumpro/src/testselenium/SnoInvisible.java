package testselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnoInvisible 
{
   public static void main(String[] args) 
   {
	    WebDriver driver=DriverFactory.getDriverFor("chrome");
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
	    driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
	    WebElement ele= driver.findElement(By.linkText("//*[text()='Employee List']"));	    
	    Select l=new Select(ele);
	    List<WebElement> options=l.getOptions();
	    for(WebElement op:options)
	    {
	    	op.getText();
	    }
	   
	   /* driver.get("https://www.redbus.in/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
	    boolean ele=driver.findElement(By.xpath("//div[@class='rb-calendar']//tr[5]/td[2]")).isEnabled();
	    System.out.println(ele); */
	    
    }
}
