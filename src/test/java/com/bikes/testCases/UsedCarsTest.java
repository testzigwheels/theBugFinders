package com.bikes.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bikes.baseClass.TestBase;
import com.bikes.pages.HondaDetailsPages;
import com.bikes.pages.LaunchPage;
import com.bikes.pages.PopularModelsPage;

public class UsedCarsTest extends TestBase {
	
	HondaDetailsPages hondaDetails = new HondaDetailsPages();
	PopularModelsPage carModels = new PopularModelsPage();
	
	 /*************************************************************************************
     * This method is used to call the 'selectChennai' method
     *************************************************************************************/

	@Test(groups = "Smoke Test")
	public void selectChennai() {
	logger = report.createTest("ZigWheels Used Cars in Chennai - Extracting popular models");
		setupDriver();
		waitFor(2);
	hondaDetails.selectChennai();
		
	}
	
	/*************************************************************************************
     * This method is used to call the 'getPopularModels' method
     *************************************************************************************/

	@Test(dependsOnMethods = "selectChennai", groups = "Smoke Test")
	public void getPopularModels() {
		
		
		carModels.getPopularModels();
	}
	
	/***************************************************************************************
	 * This method is used to verify the UsedCars page
	 ***************************************************************************************/
	
	@Test(dependsOnMethods = "getPopularModels", groups = "Regression Test")
	public void verifyChennai() {
		
		carModels.verifyPlace();
	}
	
	 /*************************************************************************************
     * This method is used to close the 'Browser'
     *************************************************************************************/

	 @AfterClass(groups = "Smoke Test")
	public void browserQuit() {
		report.flush();
		driver.quit();
	}
}
