package com.actiTime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//BaseTest is a companion class 
//giving knowledge for BaseTest by implementing autoconstant.
//this is an abstract class cannot be run. 
public abstract class BaseTest implements AutoConstant
{
	// public is to access outside of packages. 
	public WebDriver driver;
	 
	static 
	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(firefox_key, firefox_value);
		
	}
	
	@BeforeMethod
	public void precondition()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		int status = res.getStatus();
		if (status == 2)
		{
			String name = res.getName();
			GenericUtils.takescreenshot(driver, name);
		}
		driver.close();
	}
	
}

