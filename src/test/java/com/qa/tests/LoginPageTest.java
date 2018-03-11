package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{

	
	LoginPage loginpage;

	@Parameters({"browser"})
	@BeforeClass
	public void initalization(String browser) {
		
		TestBase.openBrowser(browser);
		loginpage=new LoginPage();
	}
	

	@Test(priority=3)
	public void clickLogin() {
		System.out.println("Click Login button");
		loginpage.clickLoginBtn();
	}
	
	@Parameters({"username", "password"})
	@Test(priority=2)//timeOut=1000
	public void enterValidDetails(String username, String password) {
		System.out.println("enter login Details");
		loginpage.enterUserDetails(username, password);
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle() {
		
		System.out.println("Page title");
		loginpage.validatePageTitle();
	}
	
	@Test(invocationCount=5)
	public void validateNext() {
		Assert.assertTrue(false);
	}
	
//	@AfterTest
//	public void close() {
//		TestBase.tearDown();
//	}

	
	
	@DataProvider
	public void getData() {
		
	
		
		
		
		
	}

}
