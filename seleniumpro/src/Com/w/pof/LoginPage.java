package Com.w.pof;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends OhrmBase 
{

	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='txtUsername']")
	private WebElement txtUserName;

	@FindBy(id = "txtPassword")
	private WebElement txtPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	public void enterUserName(String uName) {
		txtUserName.sendKeys(uName);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}
}
