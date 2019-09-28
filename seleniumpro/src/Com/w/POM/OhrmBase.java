package Com.w.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testselenium.DriverFactory;

public class OhrmBase 
{

	public static WebDriver driver;
	public static WebDriverWait wait;
	public void openApplication(String brName, String os) {
		driver = DriverFactory.getDriverFor(brName);
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		wait = new WebDriverWait(driver, 20);
	}
	
	public WebElement getElement(By locator) 
	{		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}
	public static void closeApplication() {
		driver.quit();
	}
    public void openApplication(String string) 
    {
    	driver.close();
	}
}
