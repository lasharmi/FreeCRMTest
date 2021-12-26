package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{

	HomePage homepage;
	LoginPage loginpage;
	TestUtil testUtil;
	ContactsPage contactspage;

	public HomePageTest()  {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
		testUtil=new TestUtil();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest() {

		String actual= homepage.verifyHomePageTitle();
		Assert.assertEquals(actual, "CRMPRO");


	}
@Test(priority=2)
public void verifyUsernameTest() {
	testUtil.switchToFrame();
	boolean b=homepage.verifyUsername();
	Assert.assertTrue(b);
}
@Test(priority=3)
	public void ContactsPageTest() {
	testUtil.switchToFrame();
		contactspage=homepage.clickonContactLink();
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
