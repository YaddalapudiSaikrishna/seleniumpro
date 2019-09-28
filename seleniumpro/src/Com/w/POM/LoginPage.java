package Com.w.POM;

import org.openqa.selenium.By;

public class LoginPage extends OhrmBase
{
		private static By txtUserName = By.xpath("//*[@id='txtUsername']");
		private static By txtPassword = By.id("txtPassword");
		private static By btnLogin = By.id("btnLogin");
		
		public void enterUserName(String uName) 
		{
			getElement(txtUserName).sendKeys(uName);
		}
		public void enterPassword(String password) 
		{
			getElement(txtPassword).sendKeys(password);
		}
		public void clickOnLogin() 
		{
			getElement(btnLogin).click();
		}
}
