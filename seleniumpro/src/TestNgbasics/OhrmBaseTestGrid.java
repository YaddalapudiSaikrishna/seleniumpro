package TestNgbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import  Com.w.POM.OhrmBase;

public class OhrmBaseTestGrid 
{
	OhrmBase ohrm;

	@BeforeClass
	@Parameters({"browser","os"})
	public void openApplication(String brName,String os){
		ohrm = new OhrmBase();
		ohrm.openApplication(brName,os);
	}

	
	@AfterClass
	public void closeApplication() {
		OhrmBase.closeApplication();
	}
}

