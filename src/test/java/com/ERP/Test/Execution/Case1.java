package com.ERP.Test.Execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ERP.Pages.Baggi_Home;
import com.ERP.Pages.Cost;

public class Case1 extends Cost{

	WebDriver d ;
	@BeforeClass
	public void l() throws Exception {
		d = lunchUrl();
		login(d, "anji@ramanasoft.com", "Ravan@123");
	}
	@Test(priority = 1)
	public void clickmenu() {
		
		selectleftOption(d, "Cost Properties");
		Assert.assertEquals(display(d, CostHeader), true);
	}
	@Test(priority = 2)
	public void clickmenuMaterial() {
		
		selectleftOption(d, "Material Section");
		Assert.assertEquals(display(d, MaterialHeader), true);
	}
	@AfterClass
	public void c() {
		d.close();
	}
}
