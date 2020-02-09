package com.wd.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Readcaptcha 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException, TesseractException, InterruptedException 
	{
		driver=DriverFactory.getDriverFor("chrome");
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("loginText")).click();
		
		Thread.sleep(5000);
		File src=driver.findElement(By.xpath("//div[@class='captcha_div']")).getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Screenshots\\captcha.png";

		FileHandler.copy(src, new File(path));
		ITesseract image=new Tesseract();
		String	imgtext=image.doOCR(new File(path));
		
	String finaltext=imgtext.split("below")[1].replaceAll("[^a-zA-z]", "");
		
		System.out.println(finaltext);



	}
}
