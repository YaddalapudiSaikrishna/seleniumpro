
package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AMAZONSignIN 
{

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("HQ");
		Thread.sleep(2000);

		String filepath="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
		String openbutton="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
			

		Screen sc=new Screen();
		Pattern p=new Pattern("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\imagesforSIKULI\\today browsebutton.PNG");
		sc.wait(p,1000);
		sc.click();

		Pattern fileinput=new Pattern(filepath+"onefile.PNG");
		Pattern openclick=new Pattern(openbutton+"open button.JPG");
		Thread.sleep(1000);

		sc.wait(fileinput,20);
		sc.click();
		sc.type(fileinput,openbutton+"my image.jpg");
		sc.click(openclick);
		driver.findElement(By.id("btnSave")).click();
	}

}
/*Screen sc=new Screen();
Pattern pauseimg=new Pattern("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\imagesforSIKULI\\paly.png");
sc.wait(pauseimg,3000);
sc.click();
Pattern playimg=new Pattern("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\imagesforSIKULI\\pause.JPG");
sc.wait(playimg,3000);
sc.click();
System.out.println(driver.getTitle()); 

String imagespath="C:\\Users\\ADMIN\\Desktop";
		String inputimages="C:\\Users\\ADMIN\\Desktop";
 */
