package TestNgbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tng_AlwaysrunMethod_01 
{		
	 @Test()
	 public void loginpage()
	 {
		System.out.println("open the site");
		System.out.println("enter username");
		System.out.println("enter password");
		Assert.fail();
	 }

	 @Test(dependsOnMethods = "loginpage",alwaysRun = true)
	 public void homepage1()
	 {
		 System.out.println("select the contacts");
		 System.out.println("give the particular productes in side the cart");
		 System.out.println(" buy the products in side of the cart");
	 }
	 @Test(dependsOnMethods = "homepage1")
	 public void closebowser()
	 {
		 System.out.println("close the focused window");
		 System.out.println("close the browser");
	 }

	
	
	

}
