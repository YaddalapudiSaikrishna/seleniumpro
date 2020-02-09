package POM_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage 
{
	private WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		driver=ldriver;
	}

	private By txtUsername=By.id("txtUsername");//9313223344
	private By txtPassword=By.id("txtPassword");
	private By btnLogin=By.id("btnLogin");
	private By admin=By.id("menu_admin_viewAdminModule");

	private WebElement username()
	{
		return driver.findElement(txtUsername);
	}
	private WebElement password()
	{
		return driver.findElement(txtPassword);
	}
	private WebElement btnLogin()
	{
		return driver.findElement(btnLogin);
	}
	
	public void enterUname(String uname)
	{
		username().sendKeys(uname);
		System.out.println("username entered "+uname);
	}
	public void enterpassword(String pd)
	{
		password().sendKeys(pd);
		System.out.println("password entered "+pd);
	}
	public void clickonlogin()
	{
		btnLogin().click();
		System.out.println("click on the login button ");
		System.out.println(driver.getTitle());
	}
	private WebElement Admin()
	{
		return driver.findElement(admin);
	}
	public void admin()
	{
		Admin().click();
		WebElement all=driver.findElement(By.id("searchSystemUser_userType"));
		Select s=new Select(all);
		s.selectByVisibleText("Admin");
	}

}
