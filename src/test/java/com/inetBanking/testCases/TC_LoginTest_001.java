package com.inetBanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
   public void loginTest() throws IOException {
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered UserName");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		
		try {	
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title=driver.getTitle();
		
		
		if(title.equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		} else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test is failed");
		}
		
		 
   } 
	
}
