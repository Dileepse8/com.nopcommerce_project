package com.nopCommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	//button[contains(text(),'Log in')]
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUsername(String username) {
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnlogin.click();
	}
	public void clickLogout() {
		lnkLogout.click();
	}
	
}


