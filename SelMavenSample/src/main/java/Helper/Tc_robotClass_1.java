package Helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.wd.util.DriverFactory;

public class Tc_robotClass_1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=DriverFactory.getDriverFor("chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("uploadBtnCont")).click();
		Thread.sleep(3000);

		String fpath="C:\\Users\\ADMIN\\Documents\\Saikrishna_resume_Automation_1+.doc";

		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(new StringSelection(fpath),null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
