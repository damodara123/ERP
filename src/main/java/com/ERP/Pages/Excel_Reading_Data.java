
package com.ERP.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ERP.Common.Excel_Read;

public class Excel_Reading_Data extends One_Time_Profile_Read{
	
	public void Loging(WebDriver driver) throws Exception
	{
		Excel_Read ex = new Excel_Read(); 
		
		XSSFSheet sheet = ex.fileloading("C:\\Users\\damod\\eclipse-workspace\\com.ERP\\src\\test\\resources\\Book.xlsx", "Sheet1");
		//with out creating object
		/*
		 * File file = new File("file location"); FileInputStream fis = new
		 * FileInputStream(file);
		 */
		
		
		
		int numberofrows = sheet.getLastRowNum();
		String uname;
		String pass;
		for(int i=1;i<=numberofrows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			uname = row.getCell(0).toString();
			pass = row.getCell(1).toString();
			login(driver, uname, pass);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(notification)));
			//if(driver.findElement(notification).isDisplayed())
			//{
				Clear(driver, username);
				Clear(driver, password);
			//}
			Thread.sleep(1000);
		}
		
		
	}
	




}
