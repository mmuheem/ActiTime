package com.actiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BasePage;

//common methods require for Basepage.
public class EnterTimeTrackPage extends BasePage
{
	//Declearation
	@FindBy(id = "logoutLink")
	private WebElement logout;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyEnterTimeTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
}
