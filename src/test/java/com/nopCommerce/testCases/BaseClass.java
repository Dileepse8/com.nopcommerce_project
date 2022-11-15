package com.nopCommerce.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nopCommerce.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsermail();
	public String password = readconfig.getpassword();
	public static WebDriver driver;

	public static Logger logger;

	@BeforeClass
	@Parameters("browser")
	public void SetUP(String brow) {
		logger = Logger.getLogger("nopEcommerce");
		PropertyConfigurator.configure("Log4j.properties");
		if (brow.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getchropath());
			driver = new ChromeDriver();
		} else if (brow.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		} else if (brow.equals("ie")) {
			// opens the browser
			System.setProperty("webdriver.ie.driver", readconfig.getiepath());
			driver = new InternetExplorerDriver();
		}

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void capturescreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot has Taken");

	}
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
