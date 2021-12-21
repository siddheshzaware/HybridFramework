package com.els.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String CaptureScreenshot(WebDriver driver)
	{
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshot=System.getProperty("user.dir")+"./Screenshots/"+GetCurrentDateTime()+"Salsforce.png";
		
		try {
			FileHandler.copy(Src ,new File(screenshot));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return screenshot;
		
	}
	public static String GetCurrentDateTime()
	{
		DateFormat customeformat=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");//creating object
		Date currdate=new Date();
		return customeformat.format(currdate);
		
	}
	public static void WindowSwitch()
	{
		
	}
	

}
