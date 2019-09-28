package Com.w.pof;

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
			addEmployeePage.enterFirstName("sai");
			addEmployeePage.enterLastName("krishna");
			addEmployeePage.clickOnSaveButton();
			
			PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();
			personalDetailsPage.clickOnEditButton();
			personalDetailsPage.selectNatianality(3);
			
			ohrm.closeApplication();

		}

	}
