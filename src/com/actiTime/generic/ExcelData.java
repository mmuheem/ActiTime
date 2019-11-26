package com.actiTime.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant
{
	public static String getData(String file_path,String sheetName, int rn, int cn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./data/input1.xslx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(sheetName).getRow(rn).getCell(cn);
			String value = cell.getStringCellValue();
			return value;
		} 
		catch (Exception e) 
		{
			return " ";
		}
	}
	
	public static int getRowCount(String file_path,String sheetName)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(file_path);
			Workbook wb = WorkbookFactory.create(fis);
			int rc = wb.getSheet(sheetName).getLastRowNum();
			return rc;
		} 
		catch (Exception e) 
		{
			return -1;
		}
	}
	

}
