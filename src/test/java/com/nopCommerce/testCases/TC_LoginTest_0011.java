package com.nopCommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce.pageObjects.LoginPage1;

public class TC_LoginTest_0011 extends BaseClass {
	@Test
	public void login() throws InterruptedException {
		driver.get(baseURL);
		LoginPage1 lp = new LoginPage1(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicklogin();

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(4000);
			lp.clicklogout();
			Assert.assertTrue(true);
			System.out.println("Test Passed");

		} else {
			Assert.assertTrue(false);
			System.out.println("Test Failed");
		}

	}

}
