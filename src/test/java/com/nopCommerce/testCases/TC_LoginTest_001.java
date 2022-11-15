package com.nopCommerce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	
	public void LoginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("URL Is Opened");// log info
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username is typed");// log info
		lp.setPassword(password);
		logger.info("Password is typed");// log info
		lp.clickLogin();
		logger.info("login is Clicked");// log info

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(4000);
			lp.clickLogout();
			logger.info("Login is passed");// log info
			Assert.assertTrue(true);
			System.out.println("Test Completed");
		} else {
			capturescreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login is Failed");// log info
		}

	}

}
