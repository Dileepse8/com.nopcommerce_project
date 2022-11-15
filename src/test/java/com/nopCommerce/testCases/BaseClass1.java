package com.nopCommerce.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {

	public String BaseURL = "http://admin-demo.nopcommerce.com/";
	public String username = "admin@yourstore.com";
	public String password = "admin";
	public static WebDriver driver;

	@BeforeClass
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
