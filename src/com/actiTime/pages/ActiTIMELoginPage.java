package com.actiTime.pages;


// All actions is done in POM class. 
// Three tc's are incorporated in single POM class. 
// 1. Verify " Valid Login Logout" - TC01.
// 2. verify "Invalid Login " - TC02.
// 3. verify "Valid Version" - TC03.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BasePage;

//common methods required from Basepage. 
public class ActiTIMELoginPage extends BasePage
{
	
	//Declaration
	@FindBy(id = "username")
	private WebElement unTB;
	
	@FindBy(name ="pwd")
	private WebElement pwTB;
	
	@FindBy(id = "loginButton")
	private WebElement login;
	
	@FindBy(xpath ="//span[contains(.,'Username or Password')]")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//nobr[contains(.,'2019.3 Pro')]")
	private WebElement version;
	
	
	//Initilize webelements
	public ActiTIMELoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void verifyPageTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);	
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	//method with datatype when return is expected. 
	public String verifyErrorMsg()
	{
		verifyElement(errorMsg);
		String aErrorMsg = errorMsg.getText();
		return aErrorMsg;
	}
	
	//method with datatype when return is expected.
	public String verifyVersion()
	{
		verifyElement(version);
		String aVersion = version.getText();
		return aVersion;
	}
}
