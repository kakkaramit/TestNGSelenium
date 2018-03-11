package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class TestBase {

	//private static TestBase tbase=null;
	public static WebDriver driver;

	public TestBase() {

	}
//
//	public static TestBase getInstnce() {
//		if(tbase==null)
//			tbase=new TestBase();
//		return tbase;
//	}

	
	public static void openBrowser(String browser) {
		if(driver==null) {
		if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Project Folder\\WorkBook 4\\TestNGProject\\src\\main\\java\\Resource\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project Folder\\WorkBook 4\\TestNGProject\\src\\main\\java\\Resource\\chromedriver.exe");
			driver=new ChromeDriver();
		}else {
			System.out.println("Driver not found");
		}
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://testing1.tk20.com");

	}

	public static void tearDown() {
		driver.quit();
	}

}
