package com.ERP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ERP.Common.Generic_Methods;

public class Baggi_Login extends Generic_Methods {

	public By Username = By.xpath("//input[@name='email']");
	public By Password = By.xpath("//input[@name='password']");
	public By SigIn = By.xpath("//button[@name='login']");
	
	public By Logo = By.xpath("//div[@class='logo-wrap']/a[@href='index.php']");
	
	
	/**
	 * This method is used to Login to application
	 * @param driver
	 * @param Uname - Pass the user name that you have to login with
	 * @param Pass - Pass the Password
	 * @return - it will Return true if it logs in successfully else false.
	 */
	public boolean login(WebDriver driver ,String Uname, String Pass) {
		boolean result = false;
		SendKeys(driver, Username, Uname);
		SendKeys(driver, Password, Pass);
		Click(driver, SigIn);
		delay(driver, Logo, 10);
		result = display(driver, Logo);
		return result ;
	}
}
