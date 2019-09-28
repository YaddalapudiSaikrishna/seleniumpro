package listeners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testselenium.DriverFactory;

public class TestNGlistenersdemo 
{   
	static WebDriver driver=null;

	@Test(priority = 0)
	public void openbrowser()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		System.out.println("--- browser opened ---");
	}
	@Test(priority = 1)
	public void loginpage()
	{   
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr222234");
		driver.findElement(By.name("password")).sendKeys("semyqag");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("*** login page pass ***");
	}
	@Test(priority = 2)
	public void closebrowser()
	{   
		try {
			Thread.sleep(1000);
			System.out.println("+++ browser closed +++");	
			driver.close();

			Alert al = driver.switchTo().alert();
			if(al.getText().equalsIgnoreCase("User or Password is not valid")) 
			{
				System.out.println("enter valid userid / enter valid password");
			}
			al.accept();  
					} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
     }
}
