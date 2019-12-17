   package TestNgbasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TESTNGParametersSAMPLE 
{
	  @Test
	  @Parameters({"myname","name"})
	  public void test(String name,String secondname)
	  {
		  System.out.println("Name is :"+name+" second name "+secondname);
	  }
	  
	  @Test
	  @Parameters({"sub1","sub2"})
	  public void test1(String name1,String name2)
	  {
		  System.out.println("first Name is :"+name1+" second name "+name2);
	  }
 
}
