package Com.w.pof;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends OhrmBase 
{
		public AddEmployeePage() 
		{
		PageFactory.initElements(driver, this);
		}
		@FindBy(id = "firstName")
		private WebElement txtFirstName;
	
		@FindBy(id = "lastName")
		private WebElement txtLastName;
	
		@FindBy(id = "btnSave")
		private WebElement btnSave;
	
		public void enterFirstName(String fName) {
			txtFirstName.sendKeys(fName);
		}
	
		public void enterLastName(String lName) {
			txtLastName.sendKeys(lName);
		}
	
		public void clickOnSaveButton() {
			btnSave.click();
		}
}



