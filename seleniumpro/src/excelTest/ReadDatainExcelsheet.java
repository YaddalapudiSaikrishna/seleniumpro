package excelTest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainExcelsheet
{
	XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ReadDatainExcelsheet(String excelpath,String sheetname) throws IOException
	{
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
	}
	public static void main(String[] args) 
	{
		getrowcount();
		getcolcount();
		getStringdata(1,1);
		getnumberdata(3,0);
	}

	public static int getrowcount()
	{ 
		int rowcount=0;
		try
		{
			rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("no of cells :"+rowcount); 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}return rowcount;
	}
	public static int getcolcount()
	{
		int colcount = 0;
		try
		{
			colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no of cells :"+colcount);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}return colcount;
	}
	public static String getStringdata(int rowNum,int colNum)
	{
		String stringdata=null;
		try
		{
			stringdata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			// System.out.println("String data :"+stringdata);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}return stringdata;
	}
	public static double getnumberdata(int rowNum,int colNum)
	{  double numdata = 0;
	try
	{
		numdata= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		// System.out.println("int data :"+numdata);
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	return numdata;
	}
}
