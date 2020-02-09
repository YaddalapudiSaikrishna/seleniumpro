package testselenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.wd.util.DriverFactory;

public class HighLightingElement
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		xpathTester(driver); // call the xpathTester method
		System.out.println(driver.getTitle());
	    driver.quit();
	}
  public static void xpathTester(WebDriver driver) 
	{	
	    //Initialize scanner and javascript executor
	    Scanner scan= new Scanner(System.in);
	    JavascriptExecutor js=((JavascriptExecutor)driver);
 	  
    	String elmFind = "newxpath";
		while (elmFind.equalsIgnoreCase("newxpath"))
		{
		    // ask for xpath
			System.out.println("give element xpath");
			String elmXpath = scan.next();
			// get list of elements using the given xpath
			List<WebElement> listElements= driver.findElements(By.xpath(elmXpath));
			// highlights all elements that are found with the given xpath		
			for (int i=0; i<listElements.size();i++) 
			{
  js.executeScript("arguments[0].style.border='3px dotted blue'",listElements.get(i));
			}
			System.out.println("Number of Elelemnts Found :" +listElements.size());
		    System.out.println("See the highlighted elements in Application");		
		    // ask for test again
			System.out.println("Do you want to Test Again ? Type :'newxpath' ");
			elmFind = scan.next();
			}
		}
	}