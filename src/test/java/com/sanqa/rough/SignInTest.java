package com.sanqa.rough;

import com.sanqa.base.Page;
import com.sanqa.pages.actions.SignInPage;

public class SignInTest {

	public static void main(String[] args) {
	
		Page.initConfiguration();
		Page.topNav.gotoSignIn();
		
		//SignInPage signin = Page.topNav.gotoSignIn();
		
		SignInPage signin = new SignInPage();
		
		signin.doLogin("ramesh.sanjay@gmail.com", "Selenium@1234");
		
		Page.quitBrowser();

	}

}
	