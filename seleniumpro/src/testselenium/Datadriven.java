package testselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

class Datadriven
{    
    static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String projectpath;
	
	public Datadriven(String excelpath,String sheetname) throws Exception
	{
		  workbook=new XSSFWorkbook(excelpath);
	      sheet =workbook.getSheet(sheetname);
	}
	public static void main(String[] args) throws Exception 
	{
		
		StringData(2,0);
		takescreenshot("guruloginpage1");
	}
	public static int getrowcount()
	{  int rowcount=0;
		try
		{
			 rowcount=sheet.getPhysicalNumberOfRows();
			 System.out.println("no of rows "+rowcount);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		    e.printStackTrace();
		}
		return rowcount;
	}
	public static int getcoloumcount()
	{    int coloumncount=0;
		try
		{
			coloumncount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no of coloums "+coloumncount);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		    e.printStackTrace();
		} return coloumncount;
	}
	public static double Numberdata(int rowNum,int cellNum)
	{   double data=0;
		try
	   {
          data=sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		// System.out.println(data);
	    }
	catch(Exception e)
	  {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	   } return data;
	}
	public static String StringData(int rowNum,int cellNum)
	{ String stringdata="null";
		 try
		   {
	        stringdata=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			// System.out.println(stringdata);
		    }
		catch(Exception e)
		  {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		   } return stringdata;
	}
	public static  void takescreenshot(String filename) throws IOException   
    {
    TakesScreenshot driver = null;
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(file, new File("C:\\Users\\ADMIN\\eclipse-workspace\\seleniumpro\\src\\testselenium/"+filename+".jpg"));
	}
}
