package POM_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addEmployee
{
	
	public addEmployee(WebDriver driver2) 
	{
		driver=driver2;
	}
private WebDriver driver;

	private By pim=By.id("menu_pim_viewPimModule");
	private By empname=By.id("empsearch_employee_name_empName");
	private By employeeid=By.id("empsearch_id");
	private By admin=By.id("menu_admin_viewAdminModule");	
	
	private WebElement PIM()
	{
		return driver.findElement(pim);
	}
	private WebElement Empname()
	{
		return driver.findElement(empname);
	}
	private WebElement Eid()
	{
		return driver.findElement(employeeid);
	}
	private WebElement Admin()
	{
		return driver.findElement(admin);
	}
	public void admin()
	{
		Admin().click();
	}
	public void pimclick()
	{
		PIM().click();
	}
	public void ename(String ename)
	{
		Empname().sendKeys(ename);
	}
	public void eid(String num) 
	{
		Eid().sendKeys(num);
	}
	
	
	
}
