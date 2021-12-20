package com.els.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.els.utility.BrowserFactory;
import com.els.utility.Exceldataprovider;
import com.els.utility.Helper;

import junit.framework.Assert;

import com.els.pages.Base;
import com.els.pages.Login;
import com.els.pages.Logout;

public class LoginTestCase extends Base{
	
	
	
	@Test(priority=1)
	public void loginApp(){
		logger=report.createTest("login to Salesforce");
		Login Login=PageFactory.initElements(driver, Login.class);
		logger.info("Strating the app");
	    Login.LoginSalesforce(data.getStringData(0, 0, 0), data.getStringData(0, 0,1));
	    
	    logger.pass("Login success");
		//System.out.println(data.getStringData("login", 0, 1));
		
	}
	
	
	@Test(priority=1)
	public void logout()
	{
		logger=report.createTest("Log out Salesforce");
		Logout logout=PageFactory.initElements(driver, Logout.class);
		logger.fail("Failed");
		logout.Logout();
		//logger.pass("Log out success");
		
	}
}
