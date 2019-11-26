package com.actiTime.tests;

// All verification points is done in test class. 
// All test data is derived from excel sheet. 
// minimum 1 method is required to run test class.
// 

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;
import com.actiTime.pages.ActiTIMELoginPage;
import com.actiTime.pages.EnterTimeTrackPage;

//BaseTest will have open and close browser. 
public class ValidLoginLogoutTest extends BaseTest
{
	//name of the test method should always start with test and priority.
	@Test (priority = 1)
	public void testValidLoginLogout()
	{
		//Reading test data 
		String loginTitle = ExcelData.getData("file_path", "TC01", 1, 2);
		String un = ExcelData.getData("./data/input1.xslx", "TC01", 1, 0);
		String pw = ExcelData.getData("./data/input1.xslx", "TC01", 1, 1);
		String enterTitle = ExcelData.getData("./data/input1.xslx", "TC01", 1, 3);
		
		
		//create an objects for each page.
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		
		//verify title ( same method is called passing different arguments values) 
		lp.verifyPageTitle(loginTitle);
		
		//enter valid un
		lp.enterUserName(un);
		Reporter.log("Username :"+un,true);
		
		//enter valid pw
		lp.enterPassword(pw);
		Reporter.log("Password  :"+pw,true);
		
		//clickon login
		lp.clickLogin();
		
		//verify EnterTime Track Title (same method is called passing different arguments values)
		lp.verifyPageTitle(enterTitle);
		
		//click on Logout
		ep.clickOnLogout();
		
		//verify title
		lp.verifyPageTitle(loginTitle);	
	}
}
