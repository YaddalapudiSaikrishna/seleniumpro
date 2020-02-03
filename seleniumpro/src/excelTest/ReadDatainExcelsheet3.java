package excelTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDatainExcelsheet3 
{
	@Test(dataProvider = "testdata")
	public void test(String username,String password)
	{
		System.out.println(username+" || "+password);
	}
	@DataProvider(name = "testdata")
	public Object[][] getdata() throws IOException
	{ 
		String excelpath="C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\excelpasswords.xlsx";
		Object[][] data=testdata(excelpath, "Sheet1");
		return data;

	}
	public static Object[][] testdata(String excelpath,String sheetname) throws IOException
	{
		ReadDatainExcelsheet excel=new ReadDatainExcelsheet(excelpath, sheetname);
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
       
		Object data[][]=new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++) 
		 {
			for(int j=0;j<colcount;j++)
			{
				String celldata= excel.getStringdata(i, j);
				//System.out.print(celldata +" || ");
				data[i-1][j]=celldata;

			}
		}
		System.out.println(" ");
		return data;
	}
}
