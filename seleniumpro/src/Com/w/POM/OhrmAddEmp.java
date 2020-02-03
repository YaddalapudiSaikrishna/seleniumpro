package Com.w.POM;

import Com.w.pof.AddEmployeePage;

public class OhrmAddEmp 
{
	public static void main(String[] args) 
	{
		OhrmBase ohrm = new OhrmBase();
		ohrm.openApplication("chrome");
		
		LoginPage loginPage = new LoginPage(); 		
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLogin();
		
		WelcomePage welcomePage = new WelcomePage();		
		welcomePage.clickOnPIMLink();
		welcomePage.clickOnAddEmployeeLink();
		
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.enterFirstName("saikrishna");
		addEmployeePage.enterLastName("sam");
		addEmployeePage.clickOnSaveButton();
		
		ohrm.closeApplication();
		
	}

}
