package Com.w.POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class GuruprojectTest 
{
    public static WebDriver driver= null;
     
     By userid= By.name("uid");                // web elements, locators
     By password=By.name("password");
     By cliclkonlogin=By.name("btnLogin");
     
     public GuruprojectTest(WebDriver driver)  // constructor 
     {
     	GuruprojectTest.driver=driver;
     }
     public void enterusername(String uname)
     {
    	 driver.findElement(userid).sendKeys(uname);
     }
     public void enterpassword(String pwd)
     {
    	 driver.findElement(password).sendKeys(pwd);
     }
     public void clicklogin()
     { 
    	 driver.findElement(cliclkonlogin).click();
    	 Alert al = driver.switchTo().alert();
  		
  		if(al.getText().equalsIgnoreCase("User or Password is not valid")) 
  		  {
  			System.out.println("enter valid userid");
  		  }
  		else 
  		 { 
  			System.out.println("enter valid password");
  		 }
  		 al.accept();
      }   

	 public void Expectedresult()        // verification 
	   {
            String str=driver.getTitle();
            if(str.equalsIgnoreCase("Guru99 Bank Manager homePage"))
               {
            	 System.out.println("Login Successfully");
            	 System.out.println(str);
               }
	   }
   public static void takescreenshot(String filename) throws IOException   // taking screenshot of results
	     {
	     File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     FileUtils.copyFile(file, new File("C:\\Users\\ADMIN\\eclipse-workspace"
	     		+ "\\seleniumpro\\src\\Com\\w\\POM/"+filename+".jpg"));   
	     }
 
}
