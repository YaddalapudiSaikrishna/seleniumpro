package CSSselectorLocators;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testselenium.DriverFactory;

public class LOGINPAGE
{
	static WebDriver driver=null;

	public static void main(String[] args) throws Exception 
	{
		driver = DriverFactory.getDriverFor("chrome");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		FileInputStream fis= new FileInputStream("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\students names.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet2");

		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(1).getLastCellNum();
		System.out.println("Numbers of rows :"+rowcount+" no of columns :"+cellcount);

		for(int row=2; row<=rowcount;row++)
		{
			XSSFRow celldata=sheet.getRow(row);          
			String firstname=celldata.getCell(0).getStringCellValue();
			String lastname=celldata.getCell(1).getStringCellValue();
			String mailID=celldata.getCell(2).getStringCellValue();
			XSSFCell num=celldata.getCell(3);
			int phone=(int)num.getNumericCellValue();
			String address=celldata.getCell(4).getStringCellValue();
			String pwd=celldata.getCell(5).getStringCellValue();
			String cpwd=celldata.getCell(6).getStringCellValue();

			driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).clear();
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).clear();
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(mailID);
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).clear();
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(String.valueOf(phone));
			driver.findElement(By.cssSelector("input#firstpassword")).sendKeys(pwd);
			driver.findElement(By.cssSelector("input#secondpassword")).sendKeys(cpwd);

			driver.findElement(By.xpath("//*[text()=' Male ']")).click();
			driver.findElement(By.xpath("//*[text()='Movies ']")).click();
			driver.findElement(By.cssSelector("input#checkbox2")).click();
			driver.findElement(By.cssSelector("div#msdd")).click();
			driver.findElement(By.xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']//li[8]")).click();

			WebElement skills=driver.findElement(By.cssSelector("select#Skills"));
			Select skill=new Select(skills);
			skill.selectByValue("HTML");
			
			WebElement countries=driver.findElement(By.cssSelector("select#countries"));
			Select country=new Select(countries);
			country.selectByValue("India");
			
			driver.findElement(By.xpath("//span[@role='combobox']")).click();
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("India");
			driver.findElement(By.xpath("//input[@role='textbox']")).click();	

			System.out.println(row+".  "+" data entered successfully row number is :"+row);
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
	}
}
/*
WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.roboform.com/site/signup");
		FileInputStream fis= new FileInputStream("C:\\Users\\ADMIN\\git\\seleniumpro\\seleniumpro\\excel data\\students names.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(1).getLastCellNum();
		System.out.println("rowcount :"+rowcount+" colcount :"+colcount);
		
		for(int row=1;row<=rowcount;row++)
		{
			XSSFRow celldata=sheet.getRow(row);
			 
			String email=celldata.getCell(0).getStringCellValue();
			String Cpwd=celldata.getCell(1).getStringCellValue();
			String Ccpwd=celldata.getCell(2).getStringCellValue();
			String fullname=celldata.getCell(3).getStringCellValue();
			
			driver.findElement(By.cssSelector("#email")).sendKeys(email);
			driver.findElement(By.cssSelector("#signup_password")).sendKeys(Cpwd);
			driver.findElement(By.cssSelector("#password_retype")).sendKeys(Ccpwd);
	        driver.findElement(By.cssSelector("#name")).sendKeys(fullname);
	        
	        System.out.println(email +" || "+Cpwd+" || "+Ccpwd+" || "+fullname);
	        driver.navigate().refresh();























*/