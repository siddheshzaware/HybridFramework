package com.els.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver StartApplication(WebDriver driver,String Bname,String Url)
	{
		if(Bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shail\\git\\HybridFramework\\HybridFramework\\Configuration\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Bname.equals("Ie"))
		{
			System.out.println("not supported ");//testing
		}
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.seconds(0));
		driver.manage().window().maximize();
		driver.get(Url);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.seconds(10));
		
		return driver;
		
	}
	public static void quite(WebDriver driver)
	{
		
		driver.quit();
	}

}
