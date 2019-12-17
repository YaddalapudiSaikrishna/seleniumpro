package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testselenium.DriverFactory;

public class verifytitle {
  @Test
  public void verifypagetitle() 
  {
	  WebDriver driver = DriverFactory.getDriverFor("firefox");
	  String exceptedtitle="Join Indian Army.";
	  String Actualtitle="";
	  driver.get("http://joinindianarmy.nic.in/Authentication.aspx");
	   Actualtitle=driver.getTitle();
	   if(Actualtitle.contentEquals(exceptedtitle))
	   {
		   System.out.println(" test is passed");
	   }else
	   {
		   System.out.println(" test is failed ");
	   }
 driver.close();
  }
}
