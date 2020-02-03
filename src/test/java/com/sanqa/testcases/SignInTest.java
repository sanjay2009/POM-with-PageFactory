package com.sanqa.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sanqa.base.Page;
import com.sanqa.pages.actions.SignInPage;
import com.sanqa.utilities.Utilities;

public class SignInTest {
	
	
	@Test()
	public  void signInTest() {
		
		/*if(data.get("runmode").equalsIgnoreCase("N"))
		{
			throw new SkipException("Skipping the test as runmode is NO");
		}*/
		
		Page.initConfiguration();
		//Page.topNav.gotoSignIn();
		
		//SignInPage signin = Page.topNav.gotoSignIn();
		
		SignInPage signin = Page.topNav.gotoSignIn();
		
		signin.doLogin("ramesh.sanjay@gmail.com", "Selenium@1234");
		
		
	}
	
	@AfterMethod
	public void teardown()
	{	
		if(Page.driver != null) {
		Page.quitBrowser();
		}
	}

}
	