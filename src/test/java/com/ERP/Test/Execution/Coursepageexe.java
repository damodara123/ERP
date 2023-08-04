package com.ERP.Test.Execution;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ERP.Pages.Excel_Reading_Data;
import com.ERP.Pages.One_Time_Profile_Read;
import com.ERP.Pages.emailtest;


public class Coursepageexe extends Excel_Reading_Data{

	WebDriver driver;
	
	
	
	@BeforeClass
	public void Login() throws Exception 
	{
		driver=lunchUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	
	@Test(enabled = false)
	public void Searching() 
	{
		//Login_execution(driver);
		//Drop_exe(driver);
		//Checkbox_exe(driver);
		//Radiobt_exe(driver);
		//Webtables_exe(driver);
		
		//webtables_text_exe(driver);
		//table_Rowdata_exe(driver);
		
		Qtp_Login(driver);
				
	}
@Test
public void QT_Login() throws Exception
{
	Loging(driver);

}

}
