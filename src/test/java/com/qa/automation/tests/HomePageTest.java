package com.qa.automation.tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.pages.HomePage;
import com.qa.automation.base.TestBase;

public class HomePageTest extends TestBase {
	HomePage homePage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage(); 
	}

	@Test (priority = 1)
	public void homePagePageTitleTest(){ 
		String homePageTitle = homePage.validateHomePageTitle();
		System.out.println("Home Page Title : " + homePageTitle);
		Assert.assertEquals(homePageTitle, "current weather and forecast - OpenWeatherMap");
	}

	@Test (priority = 2) 
	public void homePageLogoImageTest(){ boolean flag =
	homePage.validateOpenWeatherLogo(); Assert.assertTrue(flag); }

	@Test (priority = 3) 
	public void homePageBrokenLinksTest(){
		homePage.verifyBrokenLinksHomeModule(); }


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
