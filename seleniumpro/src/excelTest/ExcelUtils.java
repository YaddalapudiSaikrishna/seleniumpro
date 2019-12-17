package excelTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils 
{ 
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public  ExcelUtils(String excelpath,String sheetname)
	{   try
	{
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	}
	public static void main(String[] args) throws Exception 
	{   
	getrowcount();
	getstringdata(0,0);
	getnumberdata(2,1);
	getcoloumcount();
	}
	public static int getrowcount()
	{  int rowcount=0;
	try
	{
	
		rowcount=sheet.getPhysicalNumberOfRows();
		//System.out.println("cell row count is :"+rowcount);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	return rowcount;
	}
	public static int getcoloumcount()
	{  int coloumcount=0;
	try
	{
		coloumcount=sheet.getRow(1).getPhysicalNumberOfCells();
		//System.out.println("cell coloum count is :"+coloumcount);
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	return coloumcount;
	}
	public static void getnumberdata(int rowNum,int cellNum)
	{ 
		try
		{
			double numdata=sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static String getstringdata(int rowNum,int cellNum)
	{   
		String Stringdata="null";
	try 
	{
		Stringdata=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	return Stringdata;

	}
}

