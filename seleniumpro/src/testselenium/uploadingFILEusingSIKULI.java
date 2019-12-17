package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class uploadingFILEusingSIKULI 
{
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		WebDriver driver=DriverFactory.getDriverFor("firefox");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
		String fileName="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
		String openbutton="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
			
		Screen sc=new Screen();
		
		// goto browser click on browser button
		Pattern p=new Pattern(fileName+"newbrowser.PNG");
		sc.wait(p,1000);
		sc.click();
		
        // enter location on filename field 
		Pattern fileinput=new Pattern(fileName+"onefile.PNG");
		sc.wait(fileinput,20);
		sc.type(openbutton+"my image.jpg");
		Thread.sleep(1000);
		
		// open click button
		Pattern openclick=new Pattern(openbutton+"open button.JPG");
		sc.click(openclick);
	}
}
