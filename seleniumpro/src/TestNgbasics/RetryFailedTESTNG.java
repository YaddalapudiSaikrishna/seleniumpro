package TestNgbasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RetryFailedTESTNG 
{
	static WebDriver driver=null;
	
  @Test
  public void test1()
  {
	  System.out.println("here test 1");
	  int i=1/1;
  }
  @Test
  public void test2()
  {
   System.out.println("here test 2");	  
  }
  @Test
  public void test3()
  {
	  System.out.println("here test 3");
	  double i=20/20;
  }
}
