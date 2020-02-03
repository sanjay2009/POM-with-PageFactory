package com.sanqa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	@FindBy(xpath="//*[@id=\"gss-signin-email\"]")
	public WebElement username;
	
	@FindBy(xpath="//*[@id=\"gss-signin-password\"]")
	public WebElement password;
	
	@FindBy(css="#gss-signin-submit")
	//@FindBy(xpath="//*[@id=\"gss-signin-submit\"]")
	public WebElement signinBtn;
}
