package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class dataproviderWITHtestNG 
{ 
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
		driver.manage().window().maximize();
	}
	@DataProvider(name="testdata")
	public Object[][] test1()
	{
		Object[][] data=new Object[3][2];

		data[0][0]="username1";data[0][1]="password1";

		data[1][0]="username2";data[1][1]="password2";

		data[2][0]="username3";data[2][1]="password3";
		return data;
	}
	@Test(dataProvider = "testdata")
	public void loginpage(String uname,String pwd)
	{
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);		
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		System.out.println(uname +" "+pwd);
		driver.close();
	}
}












