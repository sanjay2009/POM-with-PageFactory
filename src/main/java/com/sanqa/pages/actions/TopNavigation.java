package com.sanqa.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.sanqa.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigate;
	public TopNavigation(WebDriver driver)
	{
		this.topNavigate= new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver , 10);
		PageFactory.initElements(factory, this.topNavigate);
	}
	
	public void gotoSignIn()
	{
		
	}
	
	public void gotoCreateAccount()
	{
		
	}
	
	public void gotoLists()
	{
		
	}
	
	public void gotoSupport()
	{
		
	}
	
	public void gotoManageTrips()
	{
		
	}
	
	public void hotels()
	{
		
	}
	
	public void flights()
	{
		
	}
	
	public void flightAndhotel()
	{
		
	}
	public void carHire()
	{
		
	}
	
	public void deals()
	{
		
	}
}
