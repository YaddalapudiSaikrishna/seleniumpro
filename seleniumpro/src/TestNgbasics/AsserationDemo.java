package TestNgbasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserationDemo 
{

	@Test(priority = 1)
	public void softassertTest()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("test1 started");
		sa.assertEquals(117, 116,"number not equal");
		System.out.println("test1 completed");
		sa.assertAll();			
	}
	@Test(priority = 2)
	public void hardassertTest()
	{
		System.out.println("test started");
		Assert.assertEquals(10, 11," number not match");
		System.out.println("test completed");
		
	}
}

/* 
1.Hard assert throws an assertException immediatly when an assert statement fails......
2.then next lines doesnot execute and it mark as a fail

1.soft assert collects all the errors during @test anntation
2.soft assert does not thrown an exception when an assert fails and would continue with the next line
3.if there is any exception and you want throw it, then you can use the assertAll() method 
4.it will collect all the softassert's and then it will give mark as failed and give errors after execution
*/