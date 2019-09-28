package Com.w.POM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testselenium.DriverFactory;

public class ScreenshotHandles 
{
  static WebDriver driver=null;
    public static void main(String[] args) 
    {
    	WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.get("http://www.google.com/");
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   
	}
    public static void takescreenshot(String filename) throws IOException
    {
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(file, new File("C:\\Users\\ADMIN\\eclipse-workspace"
    		+ "\\seleniumpro\\src\\Com\\w\\POM"+filename+" .jpg"));
   
    }
}
