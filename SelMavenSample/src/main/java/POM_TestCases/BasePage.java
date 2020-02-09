package POM_TestCases;
import org.openqa.selenium.WebDriver;

public class BasePage 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{

		SetupBrowser sb=new SetupBrowser();
		sb.openApplication();

		LoginPage lp=new LoginPage(driver);

		lp.enterUname("Admin");
		lp.enterpassword("admin123");
		lp.clickonlogin();
		lp.admin();

		addEmployee emp=new addEmployee(driver);
		emp.pimclick();
		emp.ename("SELENIUM");
		emp.eid("586975"); 
		sb.closeApplication();
	}

}
