package com.sanqa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sanqa.base.Page;
import com.sanqa.errorcollectors.Errorcollector;
import com.sanqa.pages.actions.HomePage;

public class FlightSearchTest {
	
	@BeforeTest
	public void signUp()
	{
		Page.initConfiguration();
	}
	
	@Test
	public void flightSearchTest() 
	{
		
		//System.setProperty("webdriver.chrome.driver", "F:\\PageObjectWithPageFactory\\src\\test\\resources\\driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.expedia.co.in");
		//HomePage home= PageFactory.initElements(driver, HomePage.class);
		//driver.close();
		//Page.initConfiguration();
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(), 5);
		Errorcollector.verifyEquals(home.findTabCount(), 5);
		home.goToFlights().bookAFlight("Bengaluru, India (BLR-Kempegowda Intl.)", "Goa, India (GOI-Dabolim)", "06/02/2020", "09/02/2020");;
		//home.bookAFlight("Bangalore", "Goa", "06/02/2020", "09/02/2020");
		
				
		
		
	}
	
	@AfterTest
	public void tesrdown()
	{
		Page.quitBrowser();
	}

}
