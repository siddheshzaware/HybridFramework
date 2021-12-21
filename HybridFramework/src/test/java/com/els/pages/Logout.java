package com.els.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	WebDriver driver;
	public Logout(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//*[@id=\"userNavLabel\"]")WebElement user;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")WebElement logout;
	public void Logout()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		user.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logout.click();
	}

}
