package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.ReadConfig;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get(baseUrl);
		
		logger.info("Navigating to URL");

		LoginPage lp = new LoginPage(driver);
		lp.fillUserName(ReadConfig.getProperty("UserName"));
		logger.info("Filling the username");
		lp.fillPassword(Password);
		logger.info("filling the password");
		lp.submitLogin();
		Thread.sleep(10000);
		logger.info("click on submit button");

		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		logger.info("Asserting the title");
	}
}
