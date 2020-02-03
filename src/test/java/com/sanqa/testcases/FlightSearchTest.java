package com.sanqa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
		
	@Test()
	public void flightSearchTest() 
	{
		
		/*if(data.get("runmode").equalsIgnoreCase("N"))
		{
			throw new SkipException("Skipping since runmode is No");
		}*/
		//System.setProperty("webdriver.chrome.driver", "F:\\PageObjectWithPageFactory\\src\\test\\resources\\driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.expedia.co.in");
		//HomePage home= PageFactory.initElements(driver, HomePage.class);
		//driver.close();
		
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(), 5);
		Errorcollector.verifyEquals(home.findTabCount(), 5);
		home.goToFlights().bookAFlight("Bengaluru, India (BLR-Kempegowda Intl.)", "Goa, India (GOI-Dabolim)", "16/02/2020", "19/02/2020");
		//home.bookAFlight("Bangalore", "Goa", "06/02/2020", "09/02/2020");
		
						
	}
	
	@AfterMethod
	public void tesrdown()
	{
		if(Page.driver != null) {
		Page.quitBrowser();
		}
	}

}
