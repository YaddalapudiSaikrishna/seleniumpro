package excelTest;

import java.io.IOException;

public class ReadDatainExcelsheetOBJECT 
{
	public static void main(String[] args) throws IOException 
	{
ReadDatainExcelsheet excel= 
new ReadDatainExcelsheet("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\excelpasswords.xlsx", "Sheet1");
 excel.getrowcount();
 excel.getcolcount();
 excel.getStringdata(2, 1);
 excel.getnumberdata(3, 0);
	}
}
