package excelTest;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest2 
{
	public static void main(String[] args) throws IOException {

		FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\sampledata.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("demo");

		for(int i=1;i<5;i++)
		{
			XSSFRow row=sheet.createRow(i);

			for(int j=0;j<4;j++)
			{
				row.createCell(j).setCellValue("suriya");
			}
		}
		workbook.write(fos);
		fos.close();
		System.out.println("data stored successfully in excel sheet");

	}
}
