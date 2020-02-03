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
		//click(signin.username);
		//signin.username.sendKeys(username);
		type(signin.username, username);
		//click(signin.password);
		//signin.password.sendKeys(password);
		type(signin.password, password);
		click(signin.signinBtn);
	}
	
	public void forgotPassword()
	{
		
	}
	
	
}
