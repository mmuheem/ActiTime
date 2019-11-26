package com.actiTime.tests;
//****************************************************************
//Test case - Valid Version - TC03
//****************************************************************

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;

//All verification points is done in test class. 
//All test data is derived from excel sheet. 
//minimum 1 method is required to run test class.
//

import org.testng.annotations.Test;

import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;
import com.actiTime.pages.ActiTIMELoginPage;

public class VerifyVersionTest extends BaseTest

{
	@Test(priority = 3)
	public void testVerifyVersion()
	{
		
		//Read test data from excel sheet
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String eVersion = ExcelData.getData(file_path, "TC03", 1, 0);
		
		//Create an object for a page. 
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		
		//verify Title
		lp.verifyPageTitle(loginTitle);
		
		//verify version
		String aVersion = lp.verifyVersion();
		Reporter.log("Actual Version is : "+aVersion,true);
		Reporter.log("Expected Version is : "+eVersion,true);
		
		AssertJUnit.assertEquals(aVersion, eVersion);
		Reporter.log("Version is matching...",true);
	}
}
