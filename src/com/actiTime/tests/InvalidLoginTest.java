package com.actiTime.tests;
//****************************************
// Test case - Invalid Login - TC02
//**************************************
//All verification points is done in test class. 
//All test data is derived from excel sheet. 
//minimum 1 method is required to run test class.

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;
import com.actiTime.pages.ActiTIMELoginPage;

//BaseTest will have open and close browser.
public class InvalidLoginTest extends BaseTest
{
	
	@Test(priority = 2)
	public void testInvalidLogin()
	{
		
		//Read test data from excel.
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String un = ExcelData.getData(file_path, "TC02", 1, 0);
		String pw = ExcelData.getData(file_path, "TC02", 1, 2);
		String eErrorMsg = ExcelData.getData(file_path, "TC02", 1, 2);
		
		//creating driver class.
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		
		//Verify Title
		lp.verifyPageTitle(loginTitle);
		
		//Enter invalid un
		lp.enterUserName(un);
		Reporter.log("UserName :"+un,true);
		
		//Enter invalid pw
		lp.enterPassword(pw);
		Reporter.log("Password :"+pw,true);
		
		//clickon Login
		lp.clickLogin();
		
		//verify Error Msg
		String aErrorMsg = lp.verifyErrorMsg();
		Reporter.log("Actual Error Msg :"+aErrorMsg,true);
		Reporter.log("Expected Error Msg :"+eErrorMsg,true);
		
		AssertJUnit.assertEquals(aErrorMsg, eErrorMsg);
		Reporter.log("Error Msg is matching...",true);
		Reporter.log("===============================================",true);	
	}
}
