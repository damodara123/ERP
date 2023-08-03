package com.ERP.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.ERP.Common.Generic_Methods;

public class emailtest extends Generic_Methods{
	

	public By login = By.xpath("//button[@name='login']");
	public By username = By.xpath("//input[@name='email']");
	public By password = By.xpath("//input[@name='pass']");
	
	//dropodown
	public By drop = By.xpath("//li//a[text()='About']");
	public By drop_text = By.xpath("//a[text()='Events']");
	
	
	//checkbox
	public By checkbx = By.xpath("//label[@for='checkbox-mini-0']");
	
	//radio buttons
	public By radiobt = By.xpath("//label[contains(text(),'I agree')]");
	
	//webtables size
	public By webcm = By.xpath("//*[@id=\"customers\"]/tbody/tr/th");
	public By webrw = By.xpath("//*[@id=\"customers\"]/tbody/tr");
	
	//table row and column data
	public By tbname = By.xpath("//*[@id=\"customers\"]");
	

	//particular row data	
	public By webptrow = By.xpath("//*[@id=\"customers\"]/tbody/tr[5]");
	
	
	public void Login_execution(WebDriver dr)
	{
		SendKeys(dr,username, "Damodara");
		SendKeys(dr,password, "palacharla");
		Click(dr,login);
	}
	
	public void Drop_exe(WebDriver driver)
	{
		Dropdown_Click(driver, drop);
		Click(driver, drop_text);
	}
	
	public void Checkbox_exe(WebDriver driver)
	{
		Checkbox(driver, checkbx);
	}
	
	public void Radiobt_exe(WebDriver driver)
	{
		Radiobutton(driver, radiobt);
	}
	
	public void Webtables_exe(WebDriver driver)
	{
		Web_tables_size(driver, webcm, webrw);
		
	}
	
	public void webtables_text_exe(WebDriver driver)
	{
		log.info("receive the table data");
		Web_tables_text(driver, tbname,"Giovanni Rovelli","Contact");
	}
	
	
	public void table_Rowdata_exe(WebDriver driver)
	{
		
		Tables_Row_Text(driver, tbname, webptrow);
		
	}
	
}
