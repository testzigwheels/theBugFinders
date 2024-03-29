package com.bikes.testCases;

import org.testng.annotations.Test;

import com.bikes.baseClass.TestBase;
import com.bikes.pages.LaunchPage;
import com.bikes.pages.LoginPage;

public class LoginTest extends TestBase{
	   
	LaunchPage launch = new LaunchPage();
	LoginPage login = new LoginPage();
	 LaunchPage launchPage = new LaunchPage();
	
	/*************************************************************************************
     * This method is used to call the 'clickLogin' and 'enterLoginDetail1' methods
     * while giving invalid password we are getting 'captcha' so we are putting this method under regression  
     *************************************************************************************/
	
	@Test(priority = 6, groups = "Smoke Test")
	public void clickLogin1() {
		logger=report.createTest("ZigWheels Login Test by providing invalid password");
		setupDriver();
		waitFor(3);
		launchPage.closeSignUpPopup();
		launch.clickLogin();
		waitFor(3);
		login.enterLoginDetails1();
		waitFor(3);
		report.flush();
		driver.quit();
		
		
	}
	
	/*************************************************************************************
     * This method is used to call the 'clickLogin' and 'enterLoginDetail1' methods
     *************************************************************************************/
	
	  @Test(priority = 7, groups = "Smoke Test")
	public void clickLogin2() {
		logger=report.createTest("ZigWheels Login Test by providing invalid email");
		setupDriver();
		waitFor(3);
		launchPage.closeSignUpPopup();
		launch.clickLogin();
		waitFor(3);
		login.enterLoginDetails2();
		waitFor(3);
		report.flush();
		driver.quit();
	}
	
}