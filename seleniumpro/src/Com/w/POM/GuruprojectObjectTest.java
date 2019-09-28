package Com.w.POM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import testselenium.DriverFactory;

public class GuruprojectObjectTest 
{
public static void main(String[] args) throws  IOException, InterruptedException
	{
	     LOGINPAGE();
		 Thread.sleep(2000);;
	}
	public static void LOGINPAGE() throws IOException
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.get("http://www.demo.guru99.com/v4/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
      GuruprojectTest gpt=new GuruprojectTest(driver);
	      gpt.enterusername("mngr222234");
	      gpt.enterpassword("semyqag");
	      gpt.clicklogin();
	      gpt.Expectedresult();
	      GuruprojectTest.takescreenshot("Guruloginpage");

	   }
}
