package com.cloudinfomatrix.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloudinfomatrix.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory or repository
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[text()='Sign up']")
	WebElement signup;
	
	@FindBy(xpath="//*[@id='header']/h1/a']")
	WebElement linkImage;
	
	//Initialization of page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean isDispalyPage() {
		return linkImage.isDisplayed();
	}
	
	public HomePage login(String eml,String pwd) {
		email.sendKeys(eml);
		password.sendKeys(pwd);
		submit.click();
		
		return new HomePage();
	}
}
