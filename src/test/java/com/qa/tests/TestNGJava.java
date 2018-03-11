package com.qa.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGJava {

	public static void main(String[] args) {

		TestNG testng=new TestNG();
		
		List list =new ArrayList();
		list.add("E:\\Selenium Project Folder\\WorkBook 4\\TestNGProject\\testngparallel.xml");
		
		testng.setTestSuites(list);
		testng.run();
	}

}
