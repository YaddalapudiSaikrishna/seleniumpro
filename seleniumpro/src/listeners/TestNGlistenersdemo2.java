
package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGlisteners.class)
public class TestNGlistenersdemo2 
{   
	static WebDriver driver=null;

	@Test(priority = 1)
	public void test1()
	{

		System.out.println("i am inside test 1 ");
	}
	@Test(priority = 2)
	public void test2()
	{   

		System.out.println("i am inside test 2");
	}
	@Test(priority = 3)
	public void test3()
	{   
				System.out.println("i am inside test 3");
     }
 }
