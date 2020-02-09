package com.wd.util;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CaptchaRead_01 
{
	public static void main(String[] args) throws TesseractException 
	{
     ITesseract img=new Tesseract();
     String imgText=img.doOCR(new File("C:\\Users\\ADMIN\\eclipse-workspace\\SelMavenSample\\Screenshots\\captcha.png"));
  System.out.println(imgText);
	}
}
