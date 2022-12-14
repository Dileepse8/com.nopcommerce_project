package com.nopCommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {

			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsermail() {
		String usermail=pro.getProperty("usermail");
		return usermail;
		
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
		
	}
	public String getchropath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
		
	}

	public String getiepath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
		
	}


}
