package com.els.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
WebDriver driver;
public Login(WebDriver ldriver)
{
	this.driver=ldriver;
}
@FindBy(id="username")WebElement Username;
@FindBy(id="password")WebElement pass;
@FindBy(id="Login")WebElement Login;


public void LoginSalesforce(String username,String Password)
{
	Username.sendKeys(username);
	pass.sendKeys(Password);
	Login.click();
}
}
