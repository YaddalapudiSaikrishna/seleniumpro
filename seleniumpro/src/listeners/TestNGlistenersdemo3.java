package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGlisteners.class)
public class TestNGlistenersdemo3 
{   
	static WebDriver driver=null;

	@Test(priority = 4)
	public void test4()
	{

		System.out.println("i am inside test 4");
	}
	@Test(priority = 5)
	public void test5()
	{   

		System.out.println("i am inside test 5");
	}
	@Test(priority = 6)
	public void test6()
	{   
				System.out.println("i am inside test 6");
			//	throw new SkipException("this is test is skipped");
     }
 }
