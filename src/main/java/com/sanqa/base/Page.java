package com.sanqa.base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sanqa.pages.actions.TopNavigation;
import com.sanqa.utilities.ExcelReader;
import com.sanqa.utilities.ExtentManager;

public class Page 
{
	
	/*
	 * Initialize webdriver
	 * logs
	 * exceL READER
	 * extent reports
	 * webdriver wait 
	 * 
	 * 
	 */
	public static WebDriver driver;
	//public static Properties config = new Properties();
	//public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	
	public static void initConfiguration() 
	{
		
		if(Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Launching Chrome");
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			
			
		}
		else if(Constants.browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Launching firefox");
			
		}
		else if (Constants.browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.debug("Launching InternetExplorer");
			
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		//wait = new WebDriverWait(driver);
		
		topNav = new TopNavigation(driver);
		
	}
	
	public static void quitBrowser()
	{
		driver.close();
	}
	
}
			