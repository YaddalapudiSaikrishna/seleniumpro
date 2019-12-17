package Com.w.POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GooglesearchpageObject 
	{ 
	public static WebDriver driver=null;
	 
	   By testfield = By.name("q");
	   By enterdata = By.name("btnK");
	   
	   public GooglesearchpageObject(WebDriver driver)
	   {
		   GooglesearchpageObject.driver=driver;
	   }
	   
	   public  void searchbox(String text)
	   {
		   driver.findElement(testfield).sendKeys(text);
	   }
	   public void searchButton()
	   {
		   driver.findElement(enterdata).click();
	   }
	   public void result()
	   {
			String str=driver.getTitle();
			System.out.println(str);
	   }
	  public static void Takescreenshot(String filename) throws IOException  
       {
			 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(file, new File("C:\\Users\\ADMIN\\eclipse-workspace\\seleniumpro\\src\\Com\\w\\POM//"+filename+" .jpg"));
		 }

}
