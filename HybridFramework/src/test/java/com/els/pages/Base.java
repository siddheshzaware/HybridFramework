package com.els.pages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.els.utility.BrowserFactory;
import com.els.utility.Configdataprovider;
import com.els.utility.Exceldataprovider;
import com.els.utility.Helper;
public class Base {
	
	public WebDriver driver;
	public Exceldataprovider data;
	public Configdataprovider Cf;
	public ExtentReports report;
    public ExtentTest logger;
	public ExtentHtmlReporter extent;
    
	
	
	
	@BeforeSuite
	public void setupSuite()
	{
		data=new Exceldataprovider();
		Cf=new Configdataprovider();
	    extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/Salesforce"+Helper.GetCurrentDateTime()+".html"));
	    System.out.println(extent);
	    report=new ExtentReports();
		report.attachReporter(extent);
		
	}
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.StartApplication(driver,"chrome","https://pumaenergyemea--emdve2e23p.my.salesforce.com/");
		Cf.getBrowser();
		
	}
	
	@AfterSuite
	public void TearDown()
	{
		BrowserFactory.quite(driver); 
	}
	
	@AfterMethod
	public void teardownMethod(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			 Helper.CaptureScreenshot(driver);
			 logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
			
			
		}
		else if(Result.getStatus()==ITestResult.SUCCESS)
		{
			 Helper.CaptureScreenshot(driver);
			 logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
			
			
		}
		else if(Result.getStatus()==ITestResult.SKIP)
		{
			 Helper.CaptureScreenshot(driver);
			 logger.pass("Test Skip",MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
			
			
		}
		report.flush();
	}
	
	

}
