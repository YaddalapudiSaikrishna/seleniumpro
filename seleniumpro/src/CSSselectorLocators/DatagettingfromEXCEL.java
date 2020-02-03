package CSSselectorLocators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testselenium.DriverFactory;

public class DatagettingfromEXCEL 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://online.roboform.com/site/signup");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\students names.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
		
		int rowcount =sheet.getLastRowNum();	
		int colcount=sheet.getRow(1).getLastCellNum();
		
		System.out.println("rowcount :"+rowcount+" colcount :"+colcount);
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow celldata=sheet.getRow(i);

			String mail=celldata.getCell(0).getStringCellValue();
			String createpwd=celldata.getCell(1).getStringCellValue();
			String Confirmpwd=celldata.getCell(2).getStringCellValue();
			String fullname=celldata.getCell(3).getStringCellValue();
			
			driver.findElement(By.cssSelector("#email")).clear();
			driver.findElement(By.cssSelector("#email")).sendKeys(mail);
			
			driver.findElement(By.cssSelector("#signup_password")).clear();
			driver.findElement(By.cssSelector("#signup_password")).sendKeys(createpwd);
			
			driver.findElement(By.cssSelector("#password_retype")).clear();
			driver.findElement(By.cssSelector("#password_retype")).sendKeys(Confirmpwd);
			
			driver.findElement(By.cssSelector("#name")).clear();
			driver.findElement(By.cssSelector("#name")).sendKeys(fullname);

		System.out.println(i+"."+mail+" || "+createpwd+" || "+Confirmpwd+" || "+fullname);


		}

	}
}