package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 
{
	 WebDriver driver=null;
@BeforeTest	 
public void open()
{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
	    driver.get("https://www.google.com/");
}
@Test
public void search()
{
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.name("q")).sendKeys("guru99");
}
@AfterTest
public void close()
    {
	    driver.close();
	}

}
