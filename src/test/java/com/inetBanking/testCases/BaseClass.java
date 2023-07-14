package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
    
	ReadConfig readConfig=new ReadConfig();
	
	public String baseUrl = readConfig.getAppURL();
	public String UserName = "mngr515016";
	public String Password = "rapydEp";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}