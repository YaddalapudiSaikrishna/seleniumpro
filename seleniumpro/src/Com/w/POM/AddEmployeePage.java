package Com.w.POM;

import org.openqa.selenium.By;

public class AddEmployeePage extends OhrmBase
{

		public static By txtFirstName = By.id("firstName");
		public static By txtLastName = By.id("lastName");
		public static By btnSave = By.id("btnSave");

		public void enterFirstName(String fName) {
			driver.findElement(txtFirstName).sendKeys(fName);
		}

		public void enterLastName(String lName) {
			driver.findElement(txtLastName).sendKeys(lName);
		}

		public void clickOnSaveButton() {
			driver.findElement(btnSave).click();
		}
}
