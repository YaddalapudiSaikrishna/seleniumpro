package TestNgbasics;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindow 
{
  WebDriver driver=null;
  
	public void  switchwindow(WebDriver driver) 
	{
		this.driver=driver;
	}
	public boolean toTitle(String Title)
	{
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String windowname:windows)
		{
			if(!windowname.equals(parentwindow))
			{
				driver.switchTo().window(windowname);
				if(driver.getTitle().equals(Title))
				{
					return true;
				}
				driver.switchTo().window(parentwindow);
			}
		}
		return false;
	}

}
