  package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean b = loginpage.validateLogo();
		Assert.assertEquals(b, true);
		
	}
	@Test(priority=3)
	public void loginPageTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}

}
