package com.nopCommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	public WebDriver ldriver;
	
	public LoginPage1(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;

	public void setusername(String username) {
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}

	public void setpassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);

	}

	public void clicklogin() {
		btnLogin.click();
	}

	public void clicklogout() {
		lnkLogout.click();
	}

}
