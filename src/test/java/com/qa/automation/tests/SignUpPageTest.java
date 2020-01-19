package com.qa.automation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.pages.SignUpPage;
import com.qa.automation.util.TestUtil;
import com.qa.automation.base.TestBase;

public class SignUpPageTest extends TestBase {
	SignUpPage signUpPage;
	TestUtil testutil;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		signUpPage = new SignUpPage();
	}

	@Test(priority = 1)
	public void validateCreateNewAccountTxtTest() throws InterruptedException {

		boolean flag = signUpPage.validatecreateNewAccountTxt();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void signUpModuleTest() throws InterruptedException {
		signUpPage.signUpModule(prop.getProperty("username"), prop.getProperty("pwd"), 
				prop.getProperty("repwd"), prop.getProperty("email"),prop.getProperty("company"));
		if(signUpPage.user_name.equalsIgnoreCase(prop.getProperty("username"))) 
			System.out.println(signUpPage.user_name);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
