package testselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.wd.util.DriverFactory;

public class SinglehighlightedElement 
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='4px dotted red'",fname );
	}
}
