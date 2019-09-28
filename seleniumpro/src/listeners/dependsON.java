package listeners;

import org.testng.annotations.Test;

public class dependsON 
{
	@Test(dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("0");
	} 
	@Test
	public void test2()
	{
		System.out.println("start");
	}
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("1");
	}
	@Test(dependsOnMethods = {"test3"})
	public void test4()
	{
		System.out.println("end");
	}
}
