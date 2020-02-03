package com.sanqa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators 
{

	@FindBy(css="#tab-flight-tab-hp > span.tab-label")
	public WebElement flightTab;
	
	@FindBy(css="#flight-origin-hp-flight")
	public WebElement fromcity;
	
	@FindBy(css="#flight-destination-hp-flight")
	public WebElement tocity;
	
	@FindBy(css="#flight-departing-hp-flight")
	public WebElement departingdate;
	
	@FindBy(css="#flight-returning-hp-flight")
	public WebElement returningdate;
	
	@FindBy(css="#traveler-selector-hp-flight > div > ul > li > button")
	public WebElement travellers;
	
	//@FindBy(xpath="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button/span[1]/svg")
	@FindBy(css="#traveler-selector-hp-flight > div > ul > li > div > div > div > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")
	public WebElement adults;
	
	//@FindBy(xpath="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button/span[1]/svg")
	
	@FindBy(css="#traveler-selector-hp-flight > div > ul > li > div > div > div > div.children-wrapper > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")
	public WebElement children;
	
	@FindBy(css="#flight-age-select-1-hp-flight")
	public WebElement childage;
	
	@FindBy(xpath="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/footer/div/div[2]/button")
	public WebElement close;
	
	@FindBy(xpath="//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button")
	public WebElement search;
}
