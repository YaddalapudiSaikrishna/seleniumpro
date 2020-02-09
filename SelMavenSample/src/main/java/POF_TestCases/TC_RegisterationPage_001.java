package POF_TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class TC_RegisterationPage_001
{
	@Test
	public void siteRegistrationPage() throws InterruptedException
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize(); 
	        
        Loginpage lp=new Loginpage(driver);
        
        lp.fname("GM");
        lp.lname("GN");
        lp.address("sri Br kphb road number 3  hyderabad 50007");
        lp.Email("gmgn@gmail.com");//  8487050254
        lp.phone("7710098055");
        lp.Gender();   lp.Hobbies();
        lp.Language(); lp.skills();
        lp.country();  lp.scountry();
        lp.password("Sai1178100@"); lp.cpassword("Sai1178100@");
        lp.year();     lp.month();
        lp.day();      
        lp.submit(); 
       // validation
        Thread.sleep(4000);
        String title1=driver.getTitle();
        System.out.println(title1);
        
        if(title1.equals("Web Table"))
        {
        	System.out.println("login success");
        }
        else
        {
        	System.out.println("login failed");
        }
	}
}










