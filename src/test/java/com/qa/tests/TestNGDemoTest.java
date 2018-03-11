package com.qa.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.util.RetryAnalyzer;
import com.qa.util.TestNGListners;

public class TestNGDemoTest {
	
	@BeforeTest
	public void beforeMMethod() {
		System.out.println("Before Method");
	}
	
	@Test(priority=1, groups="Sanity")
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=4, groups="Funtional" )// retryAnalyzer = RetryAnalyzer.class for class level
	public void test2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2, enabled=false)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=2, dependsOnMethods="test2", groups="Funtional") //dependOnMethods and dependOnGroups
	public void test4() {
		System.out.println("Test 4");
		throw new SkipException("Skipping - This is not ready for testing ");
	}
	
	@Test(priority=6, groups="Sanity", expectedExceptions=ArithmeticException.class)
	public void test5() {
		System.out.println("Test 5");
		int i=9/0;
		
		System.out.println(i);
		System.out.println("New term");
	}
	
	@Test(priority=5, timeOut=1000, groups="Sanity", invocationCount=3)
	public void test6() {
		System.out.println("Test 6");
	}
	
	
	
	@AfterTest
	public void afterMMethod() {
		System.out.println("After Method");
	}

}
