package POF_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage 
{
	WebDriver driver;
	public Loginpage(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver1,this);
	}
	@FindBy(how=How.XPATH,using="//input[@ng-model='FirstName']")
	@CacheLookup
	WebElement firstname;

	@FindBy(how=How.XPATH,using="//input[@ng-model='LastName']")
	@CacheLookup
	WebElement lastname;

	@FindBy(how=How.XPATH, using="//textarea[@ng-model='Adress']")
	WebElement address;

	@FindBy(how=How.XPATH,using="//input[@ng-model='EmailAdress']")
	@CacheLookup
	WebElement Email;

	@FindBy(how=How.XPATH,using="//input[@ng-model='Phone']")
	WebElement phone;

	@FindBy(how=How.XPATH,using="//input[@value='FeMale']")
	WebElement Gender;

	@FindBy(how=How.CSS,using="#checkbox3")
	WebElement Hobbies;

	@FindBy(how=How.ID,using="msdd")
	WebElement Lang;

	@FindBy(how=How.ID, using="Skills")
	WebElement skills;

	@FindBy(how=How.ID,using="countries")
	WebElement country;

	@FindBy(how=How.ID,using="firstpassword")
	WebElement password;

	@FindBy(how=How.ID,using="secondpassword")
	WebElement cpassword;

	@FindBy(how=How.XPATH,using="//*[@id='country']")
	WebElement scounrty;

	@FindBy(how=How.ID,using="yearbox")
	WebElement year;
	@FindBy(how=How.XPATH,using="//*[@placeholder='Month']")
	WebElement month;
	@FindBy(how=How.ID,using="daybox")
	WebElement day;

	@FindBy(how=How.XPATH,using="//button[text()=' Submit ']")
	WebElement submit;

	public void fname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void lname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void Email(String mail)
	{
		Email.sendKeys(mail);
	}
	public void address(String Address)
	{
		address.sendKeys(Address);
	}
	public void phone(String Number)
	{
		phone.sendKeys(Number);
	}
	public void Gender()
	{
		Gender.click();
	}
	public void Hobbies()
	{
		Hobbies.click();
	}
	public void Language()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		Lang.click();
		//driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
	}
	public void skills()
	{
		Select skill=new Select(driver.findElement(By.id("Skills")));
		skill.selectByVisibleText("Art Design");
	}
	public void country()
	{
		Select country=new Select(driver.findElement(By.id("countries")));
		country.selectByVisibleText("India");	
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void cpassword(String pwd)
	{
		cpassword.sendKeys(pwd);
	}
	public void scountry()
	{  
		Select scountry=new Select(driver.findElement(By.xpath("//*[@id='country']")));
		scountry.selectByVisibleText("India");
	}
	public void year()
	{
		Select y=new Select(driver.findElement(By.id("yearbox")));
		y.selectByVisibleText("2001");
	}
	public void month()
	{
		Select m=new Select(driver.findElement(By.xpath("//*[@placeholder='Month']")));
		m.selectByVisibleText("August");
	}
	public void day()
	{
		Select d=new Select(driver.findElement(By.id("daybox")));
		d.selectByVisibleText("21");
	}
	public void submit()
	{
		submit.click();
	}

}
