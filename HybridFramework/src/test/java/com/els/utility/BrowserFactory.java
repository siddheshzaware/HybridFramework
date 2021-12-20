package com.els.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver StartApplication(WebDriver driver,String Bname,String Url)
	{
		if(Bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shail\\eclipse-workspace\\HybridFramework\\Configuration\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Bname.equals("Ie"))
		{
			System.out.println("not supported ");
		}
		//driver.manage().timeouts().pageLoadTimeout(30,Timeout.seconds(0));
		driver.manage().window().maximize();
		driver.get(Url);
		//driver.manage().timeouts().implicitlyWait(30, Timeout.seconds(10));
		
		return driver;
		
	}
	public static void quite(WebDriver driver)
	{
		
		driver.quit();
	}

}