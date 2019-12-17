package testselenium;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdowns
{
	 static WebDriver driver=null;
  public static void main(String[] args) throws Exception
  {
			    WebDriver driver = DriverFactory.getDriverFor("firefox");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				String a=driver.getTitle();
				System.out.println(a);
		        WebElement DaydropdownElement= driver.findElement(By.id("day"));
		        WebElement monthdropdownElement= driver.findElement(By.id("month"));
		        WebElement yeardropdownElement= driver.findElement(By.id("year"));
		        driver.manage().window().maximize();
		        Select day=new Select(DaydropdownElement);
		        Select month=new Select(monthdropdownElement);
		        Select year=new Select(yeardropdownElement);
		        
		        day.selectByIndex(21);
		        month.selectByVisibleText("Aug");
		        year.selectByValue("2000");
		        
		        List<WebElement> elementsCount = day.getOptions();
			    
		        for(int i =0; i<=elementsCount.size(); i++)
		        {
		        String options = elementsCount.get(i).getText();
		        System.out.println(options);
		        }
		        assertTrue(" the title is incorrect",driver.getTitle().equals("Facebook - log i sign up"));
	  }
}
