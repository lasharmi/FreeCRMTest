package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'group automation')]")
	WebElement usernameLable;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	

	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyUsername() {
		 return usernameLable.isDisplayed();
	}

	public ContactsPage clickonContactLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	

	public DealsPage clickonDeals() {
		dealslink.click();
		return new DealsPage();
	}
	
	public TasksPage clickonTask() {
		taskslink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	

}


