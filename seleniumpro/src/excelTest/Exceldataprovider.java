package excelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testselenium.DriverFactory;

public class Exceldataprovider 
{ 
	static WebDriver driver=null;
	@BeforeTest
	public void entrydata()
	{
		driver=DriverFactory.getDriverFor("firefox");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();

	}
	@Test(dataProvider = "testcase1")
	public void testcase1(String username,String password) throws Exception
	{
		System.out.println(username+" "+password);
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);	

		Alert al = driver.switchTo().alert();

		if(al.getText().equalsIgnoreCase("Guru99 Bank Manager homePage")) 
		{  System.out.println("guru page is successfully login");	}
		
		if(al.getText().equalsIgnoreCase("User or Password is not valid")) 
		{  System.out.println("enter valid userid / enter valid password");	}
		else 
		{ al.accept(); }  
	}
	@DataProvider(name="testcase1")
	public Object[][] Getdata()
	{
		String excelpath="C:\\Users\\ADMIN\\eclipse-workspace\\seleniumpro\\excel data\\students names.xlsx";
		testdata(excelpath,"sheet1");
		Object data[][]=testdata(excelpath,"sheet1");
		return data;
	}
	public Object[][] testdata(String excelpath, String sheetname)
	{
		ExcelUtils excel=new ExcelUtils(excelpath, sheetname);
		int rowcount =excel.getrowcount();
		int coloumcount =excel.getcoloumcount();
		Object data[][] =new Object[rowcount-1][coloumcount];

		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<coloumcount;j++)
			{
				String cellData=excel.getstringdata(i,j);
				data[i-1][j]=cellData;
			}
		} return data;

	}

}
