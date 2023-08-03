package com.ERP.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class One_Time_Profile_Read extends emailtest{
	
	public By login = By.xpath("//button[text()='Sign In']");
	public By username = By.id("email");
	public By password = By.id("password");
	
	public By notification = By.id("signin");
	
	
	public void Qtp_Login(WebDriver driver)
	{
		SendKeys(driver, username, "qtlineone@gmail.com");
		SendKeys(driver, password, "erp@1234");
		Click(driver, login);
		log.info("QTP login sucessfully");
		
	}
	
	public void login(WebDriver driver, String uName, String pass)
	{
		SendKeys(driver, username, uName);
		SendKeys(driver, password, pass);
		Click(driver, login);
		
	}
	
}
