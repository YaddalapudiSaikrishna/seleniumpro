package Com.w.POM;

import org.openqa.selenium.By;

public class WelcomePage extends OhrmBase
{
		public static By lnkPIM = By.linkText("PIM");
		public static By lnkAddEmployee = By.partialLinkText("Add Emp");
		
		public void clickOnPIMLink(){
			driver.findElement(lnkPIM).click();
		}

		public void clickOnAddEmployeeLink() {
			driver.findElement(lnkAddEmployee).click();
		}
}

