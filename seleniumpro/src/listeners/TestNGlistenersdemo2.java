
package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGlisteners.class)
public class TestNGlistenersdemo2 
{   
	static WebDriver driver=null;

	@Test
	public void test1()
	{

		System.out.println("i am inside test 1 ");
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{   
		System.out.println("i am inside test 2");
		throw new SkipException(" skiped the test");
	}
	@Test
	public void test3()
	{   
				System.out.println("i am inside test 3");
     }
 }
