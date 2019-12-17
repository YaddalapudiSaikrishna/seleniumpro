package testselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class uploadingPDFfile 
{
	public static void main(String[] args) throws FindFailed 
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://www.monsterindia.com/seeker/v2/registration?spl=Google_INDIA_Search_Monster_Resume_Search_Campaign_Goal_LP_Core_Brand_Old_Exact_Web_S_Core_Brand_Old_monster_e_391851027304__9062134_&WT.mc_n=olm_sk_Google_INDIA_Search_Monster_Research_Search_Campaign_Goal_LP_Core_Brand_Old_Exact_Web_S_Core_Brand_Old_monster_e_391851027304__9062134_&gclid="
				+ "Cj0KCQjwgNXtBRC6ARIsAIPP7RtbQcOwWVhtyADVS609EwQA3m5EZ0qNsZtDjbjAodWVUViMXarHy_UaAteuEALw_wcB");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@class='upload-file']")).click();
		
		String filepath="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
		String openbutton="C:\\Users\\ADMIN\\Desktop\\optum\\Servers\\";
		String image="C:\\Users\\ADMIN\\Desktop\\Selenium notes\\";

		Screen sc=new Screen();

		Pattern filename=new Pattern(filepath+"onefile.PNG");
		sc.wait(filename,20);
		sc.click();
		sc.type(image+"17TestNG");

		Pattern okbutton=new Pattern(openbutton+"open button.JPG");
		sc.click(okbutton);

	}

}













