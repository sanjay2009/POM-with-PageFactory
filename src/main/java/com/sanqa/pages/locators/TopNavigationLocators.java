package com.sanqa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators 
{

	@FindBy(css="#header-account-menu")
	public WebElement accountBtn;
	
	@FindBy(css="#account-signin")
	public WebElement signInBtn;
	
	@FindBy(css="#account-register")
	public WebElement createAccountBtn;
	
}
