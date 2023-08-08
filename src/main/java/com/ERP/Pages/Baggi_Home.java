package com.ERP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baggi_Home extends Baggi_Login{

	
	public By ToggleMenu = By.id("toggle_nav_btn");
	
	
	/**
	 * th
	 * @param driver - 
	 * @param text
	 */
	public void selectleftOption(WebDriver driver,String text) {
		
		By option = By.xpath("//span[text()='"+text+"']/../..");
		Click(driver, option);
	}
}
