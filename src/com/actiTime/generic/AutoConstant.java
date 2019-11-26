package com.actiTime.generic;

//*********************************************************************************************
//   To achieve standardization and specification - methods name should be same. 
//   Multiple inheritance can be achieved with the help of interface. 
//**********************************************************************************************

//within interface we can define static variable and interface methods. 
//within interface all the variables by default static and final. 
//using interface we create derived datatypes(programmer defined datatypes). 
//interface allows only abstract methods( incomplete methods ).
//By default interface is abstract.
//interface objects cannot be created.
//interface must have a companion class. 
//interface is like a question paper, can be implemented in more than one class. 

public interface AutoConstant 
{
    String chrome_key = "webdriver.chrome.driver";
	String chrome_value = "./Drivers/chromedriver.exe";
	String firefox_key = "webdriver.gecko.driver";
	String firefox_value = "./Drivers/geckodriver.exe";
	String file_path = "./data/input1.xslx";
}
