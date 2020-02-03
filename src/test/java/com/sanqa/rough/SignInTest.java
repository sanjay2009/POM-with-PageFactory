package com.sanqa.rough;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sanqa.base.Page;
import com.sanqa.pages.actions.SignInPage;

public class SignInTest {
	
	@BeforeTest
	public void signUp()
	{
		Page.initConfiguration();
	}

	@Test
	public  void signInTest() {
	
		
		Page.topNav.gotoSignIn();
		
		//SignInPage signin = Page.topNav.gotoSignIn();
		
		SignInPage signin = new SignInPage();
		
		signin.doLogin("ramesh.sanjay@gmail.com", "Selenium@1234");
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		Page.quitBrowser();
		

	}

}
	