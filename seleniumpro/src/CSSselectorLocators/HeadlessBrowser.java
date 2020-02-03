package CSSselectorLocators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Drivers\\chromedriver_new\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());		
	}


}
