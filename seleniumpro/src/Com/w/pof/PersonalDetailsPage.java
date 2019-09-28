package Com.w.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage 
{
	WebDriver driver;
		public PersonalDetailsPage() 
		{
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "btnSave")
		private WebElement btnEdit;
		
		@FindBy(id="personal_cmbNation")
		private WebElement lstCountry;
		
		public void clickOnEditButton() {
			btnEdit.click();
		}
		
		public void selectNatianality(String country) {
			
			new Select(lstCountry).selectByVisibleText(country);
		}
		
		public void selectNatianality(int cIndex) {
			
			new Select(lstCountry).selectByIndex(cIndex);
		}
}

