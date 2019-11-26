package com.actiTime.generic;
// Generic class contains generic reusable methods
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void takescreenshot(WebDriver driver, String name)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File src = ts.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./screenshots/"+name+".png");
			 FileUtils.copyFile(src, dest);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	//****************************** Generic code for Select class ******************************
	public static void selectByIndex(WebElement ele,int Index)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(Index);
	}
	
	public static void selectByValue(WebElement ele,String value)
	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}
	
	public static void deselectByIndex(WebElement ele, int Index)
	{
		Select sel = new Select(ele);
		sel.deselectByIndex(Index);
	}
	
	public static void deselectByValue(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.deselectByVisibleText(value);
	}
	
	public static void deselectAll(WebElement ele)
	{
		Select sel = new Select(ele);
		sel.deselectAll();
	}
	//___________________________________________________________________________________________
	//********************* Generic code for Action class ****************************************
	public static void moveToElement(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public static void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public static void dragAndDrop(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public static void contextClick(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	//__________________________________________________________________________________________
	//******************Include Generic code for iframe class *********************************
	//_________________________________________________________________________________________
	//******************Include Generic code for popup's class ********************************* 
	
}
