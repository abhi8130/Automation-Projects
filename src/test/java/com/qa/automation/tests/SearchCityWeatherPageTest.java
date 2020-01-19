package com.qa.automation.tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.SearchCityWeatherPage;
import com.qa.automation.util.TestUtil;
import com.qa.automation.base.TestBase;

public class SearchCityWeatherPageTest extends TestBase {

	SearchCityWeatherPage searchCityWeather;
	TestUtil testutil;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		searchCityWeather = new SearchCityWeatherPage();
	}

	@Test (priority = 1) 
	public void searchByValidCityTest() throws InterruptedException {
		searchCityWeather.searchByValidCity(prop.getProperty("validCity"));
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
		searchCityWeather.selectCityFromTable(); 
	}

	@Test(priority = 2)
	public void searchByInvalidCityTest() {
		searchCityWeather.searchByInValidCity(prop.getProperty("invalidCity"));
		boolean flag = searchCityWeather.validateNoFoundTxt();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
