package Com.w.POM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import testselenium.DriverFactory;

public class Googlesearchpagetest 
{
	 static WebDriver driver=null;
	 
   public static void main(String[] args) throws Exception 
     {
	   Thread.sleep(2000);
	   GoogleSearchpagetest();
     }
	public static void GoogleSearchpagetest() throws IOException   
	       {
				   WebDriver driver = DriverFactory.getDriverFor("chrome");
				   driver.get("https://www.google.com/");
				   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				   driver.manage().window().maximize();
	    GooglesearchpageObject gspo=new GooglesearchpageObject(driver);
		           gspo.searchbox("kaappaan rating ");
				   gspo.searchButton();
			       gspo.result();
			       GooglesearchpageObject.Takescreenshot("googlePage2");
			}

    
}
