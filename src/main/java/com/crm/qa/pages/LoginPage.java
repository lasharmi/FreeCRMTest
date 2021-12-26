package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement logo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String us, String pwd) {
		username.sendKeys(us); 
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	
	
	
	
	

}
