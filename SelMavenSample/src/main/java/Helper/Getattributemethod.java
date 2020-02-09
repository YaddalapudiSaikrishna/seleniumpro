package Helper;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributemethod
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Drivers\\chromedriver\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.SHIFT,"sai");
		System.out.println("enter data on single frame textbox");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		System.out.println("control back to main page");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);

		System.out.println("click the multiple frame button");
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input[@type='text']")).sendKeys(Keys.SHIFT,"krishna");

		System.out.println("enter data on multiple frame");
		driver.switchTo().defaultContent();
		System.out.println("control back to main frame");
		System.out.println("end");
	}
}





