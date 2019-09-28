package TestNgbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import Com.w.POM.OhrmBase;

public class OhrmBaseTest 
{	OhrmBase ohrm;

	@BeforeClass
	@Parameters({"browser"})
	public void openApplication(@Optional("chrome") String brName) {
		ohrm = new OhrmBase();
		ohrm.openApplication(brName);
	}

	
	@AfterClass
	public void closeApplication() {
		ohrm.closeApplication();
	}
}