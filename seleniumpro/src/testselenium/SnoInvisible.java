package testselenium;

import java.util.List;

import org.openqa.selenium.By;
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
	    
	   
	    
	    driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
	   
	    driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
	    WebElement ele= driver.findElement(By.linkText("//*[text()='Employee List']"));
	    
	    Select l=new Select(ele);
	    List<WebElement> options=l.getOptions();
	    for(WebElement op:options)
	    {
	    	op.getText();
	    }
    }
}
