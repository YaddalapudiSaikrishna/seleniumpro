package TestNgbasics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.w.pof.AddEmployeePage;
import Com.w.pof.LoginPage;
import Com.w.pof.OhrmBase;
import Com.w.pof.WelcomePage;

public class OhrmAddEmployee {
	OhrmBase ohrm;

	@BeforeClass
	public void openApplication() 
	{
		ohrm = new OhrmBase();
		ohrm.openApplication("chrome");
	}
	
	@Test
	public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLogin();
	}

	@Test(dependsOnMethods = "login")

	public void addEmployee() {
		WelcomePage welcomePage = new WelcomePage();
		welcomePage.clickOnPIMLink();
		welcomePage.clickOnAddEmployeeLink();

		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.enterFirstName("Alex");
		addEmployeePage.enterLastName("john");
		addEmployeePage.clickOnSaveButton();

	}
}
