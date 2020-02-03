package com.sanqa.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.sanqa.base.Page;
import com.sanqa.pages.locators.HomePageLocators;

public class HomePage extends Page
{
	
	public HomePageLocators home;
	public HomePage()
	{
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
		
	}
	
	public HomePage goToFlights()
	{
		home.flightTab.click();
		return this;
	}
	
	public int findTabCount()
	{
		return home.tabcount.size();
	}
	
	public void goToHotels()
	{
		
	}
	
	public void goToFlightsAndHotels()
	{
		
	}
	
	public void goToCarHire()
	{
		
	}
	
	public void goToHolidayActivities()
	{
		
	}
	
	public void bookAFlight(String from, String to, String departing, String returning)
	{
		home.fromcity.click();
		home.fromcity.sendKeys(from);
		
		home.tocity.click();
		home.tocity.sendKeys(to);
		
		home.departingdate.click();
		home.departingdate.sendKeys(departing);
		
		
		home.returningdate.click();
		home.returningdate.sendKeys(returning);
		
		home.travellers.click();
		home.adults.click();
		//home.adults.sendKeys(noOfAdults);
		
		home.children.click();
		//Select dp = new Select(driver.findElement(By.id("flight-age-select-1-hp-flight")));
		//dp.selectByVisibleText("2");
		home.childage.sendKeys("4");
		
		//driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/footer/div/div[2]/button")).click();
		
		home.close.click();
		home.search.click();
		
		
		
		
		//home.children.sendKeys(noOfChildren);
		
	}
	
	
}
