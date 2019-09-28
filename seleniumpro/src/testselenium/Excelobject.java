package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelobject 
{	
	static WebDriver driver=null;
	
	@BeforeTest
	public void test1()
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider="case1")
	public void test(String username,String password) throws Exception
	{
		// System.out.println(username+password);
		driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);	
	}
	@DataProvider(name="case1")
	public Object[][] getdata() throws Exception
	{
		String excelpath="C:\\Users\\ADMIN\\eclipse-workspace\\seleniumpro\\excel data\\students names.xlsx";
	    Object obj[][] = testdata(excelpath,"sheet1");
	    return obj;
	}
	public static Object[][] testdata(String excelpath,String sheetname) throws Exception
	{
		Datadriven data=new Datadriven(excelpath,sheetname);
		int rowcount = data.getrowcount();
		int coloumcount=data.getcoloumcount();
		data.takescreenshot("guruloginpage1");
		
		Object obj[][]=new Object[rowcount-1][coloumcount];		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<coloumcount;j++)
			{
				String stringdata=data.StringData(i,j);
				System.out.print(stringdata +" | ");
				obj[i-1][j]=stringdata;
			}
		   System.out.println();
		 }
		return obj;
	}
}
