package CSSselectorLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import testselenium.DriverFactory;

public class HandlingFLASHobjects 
{
	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://www.youtube.com/watch?v=h8u2sLZg1DY&list=PLyA96Xm_UOS5jqOFiiYbTL_-f-Yti2YOp&index=1");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String mainpath="C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\imagesforSIKULI\\";
		Screen sc = new Screen();

		Pattern pause= new Pattern(mainpath+"pause.png");
		sc.click();

		Pattern play= new Pattern(mainpath+"palybutton.png");
		sc.click();
		
		Thread.sleep(2000);


		Pattern tmode= new Pattern(mainpath+"Tmode.PNG");
		sc.click(tmode);







	}
}








