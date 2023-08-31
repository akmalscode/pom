package com.cloudinfomatrix.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cloudinfomatrix.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"dashboardRoot\"]/span/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/ul/li[1]/div[2]/div/div/a/div/div/span/span")
	WebElement payments;
	
	
	
	

}
