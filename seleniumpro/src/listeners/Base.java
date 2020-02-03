package listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import testselenium.DriverFactory;

public class Base 
{
	static WebDriver driver;
	public void intialization() throws InterruptedException
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html"); //http://www.demo.guru99.com/v4/
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*driver.findElement(By.name("uid")).sendKeys("mngr238870");
        driver.findElement(By.name("password")).sendKeys("hUtAbAs");
        driver.findElement(By.name("btnLogin")).click();*/
	}
	public void failed(String methodName)
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\FailedScreenShots\\"+methodName+"_.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
