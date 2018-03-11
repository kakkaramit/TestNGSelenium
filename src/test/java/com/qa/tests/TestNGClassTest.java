package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClassTest {
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	
	
	@AfterMethod
	public void afterMMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("After Class");
	}
	
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("After Test");
	}
	
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("After Suite");
	}

}
