package com.sanqa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.sanqa.base.Page;
import com.sanqa.pages.locators.SignInPageLocators;

public class SignInPage extends Page
{
	public SignInPageLocators signin;
	public SignInPage()
	{
		this.signin = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.signin );
	}
	
	public void doLogin(String username, String password)
	{
		signin.username.click();
		signin.username.sendKeys(username);
		signin.password.click();
		signin.password.sendKeys(password);
		signin.signinBtn.click();
	}
	
	public void forgotPassword()
	{
		
	}
	
	
}
