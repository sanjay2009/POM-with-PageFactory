package com.sanqa.rough;

import com.sanqa.base.Page;
import com.sanqa.pages.actions.HomePage;

public class FlightSearchTest {
	
	public static void main(String[] args) 
	{
		
		//System.setProperty("webdriver.chrome.driver", "F:\\PageObjectWithPageFactory\\src\\test\\resources\\driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.expedia.co.in");
		//HomePage home= PageFactory.initElements(driver, HomePage.class);
		//driver.close();
		Page.initConfiguration();
		HomePage home = new HomePage();
		home.goToFlights().bookAFlight("Bengaluru, India (BLR-Kempegowda Intl.)", "Goa, India (GOI-Dabolim)", "06/02/2020", "09/02/2020");;
		//home.bookAFlight("Bangalore", "Goa", "06/02/2020", "09/02/2020");
		
		
		Page.quitBrowser();
		
		
		
	}

}
