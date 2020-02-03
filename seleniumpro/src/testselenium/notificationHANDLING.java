package testselenium;
import org.openqa.selenium.WebDriver;

public class notificationHANDLING 
{
WebDriver driver=null;

	public static void main(String[] args)
	{
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		driver.get("https://webengage.com/campaign-lp/web-push-notification/?utm_source=google-ads&utm_medium=cpc&utm_campaign=s-generic%20keywords&utm_term=%2Bweb%20%2Bpush&gclid=CjwKCAjwxt_tBRAXEiwAENY8heiwp-GZzAEu9PF4excOTGS7ChsvfV9fnZWZPiOm7LnSmBipTfjjTxoCdV8QAvD_BwE");
		System.out.println(driver.getTitle());
	}

}
