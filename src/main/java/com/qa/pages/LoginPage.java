package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;



public class LoginPage extends TestBase {

	String loginPageTitle="CampusTools HigherE1d - Log In";

	@FindBy(how=How.ID, using="user")
	WebElement username;

	@FindBy(how=How.ID, using="pass")
	WebElement password;

	@FindBy(how=How.NAME, using="login2")
	WebElement loginbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		//System.out.println(driver.getTitle());
		return driver.getTitle();
		
		
	}

	public void validatePageTitle() {
		String actualTitle=getPageTitle();
		Assert.assertEquals("Page title is not matched.", loginPageTitle, actualTitle );
	}

	public void enterUserDetails(String username1, String password1) {
		username.sendKeys(username1);
		password.sendKeys(password1);
	}

	public void clickLoginBtn() {
		loginbtn.click();
	}

}
