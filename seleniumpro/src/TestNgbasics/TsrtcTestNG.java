package TestNgbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testselenium.DriverFactory;

public class TsrtcTestNG 
{
  @Test
  public void setupBrowser() 
  {
	 WebDriver driver = DriverFactory.getDriverFor("chrome");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
}
