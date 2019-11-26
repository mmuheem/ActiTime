package com.actiTime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	//global variable
	WebDriver driver;
	
	//constructor with argument. 
	//data transfer happens from right to left. 
	//constructor is used to initilize instance variables of the current object. 
	public BasePage (WebDriver driver)
	{ 
		this.driver = driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		//explicit wait added
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching..."+eTitle,true);	
		} 
		catch (Exception e) 
		{
			Reporter.log("Title is not matching...", true);
			Reporter.log("Actual Title is :"+driver.getTitle(),true);
			Reporter.log("Expected Title is :"+eTitle,true);
			Assert.fail();
		}
	}
	
	public void verifyElement(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element is present...",true);	
		} 
		catch (Exception e) 
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
}
