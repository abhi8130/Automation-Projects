# Page Object model Using Page Factory Test automation framework using Selenium with Java, TestNG and Maven-
This is a project to automate the web application which consists of product creation, listing, updates and deletion  
###### We used Data driven framework using POM design pattern & Page factory for object repository
###### TestNG for Testing Famework
###### Using pom. xml(Maven) one can configure dependencies needed for building testing and running code

#### Dependency
Java
Maven

###libraries used
Selenium
TestNG
Maven

### Steps to Import the project & execute the tests
1. Import the project from download location
2. Change the config property file path (From com.qa.automation.base [package] ---> TestBase.java)
3. Run the project from TestNg.xml (Right click on that file and Run as TestNG suite )


# Project Contains:
###### Page class for every page of the application i.e. HomePage, SearchCityWeatherPage, SignUpPage
###### Using page factory, object reposiotry resides on page class itself 
###### Test Class to invoke the method by using testng annotations i.e @priority
###### config.properties file is there for having url,username,password,email,company name,validCity,invalidCity

# Acceptance Criteria:
1. HomePage - contains method i.e validateHomePageTitle, validateOpenWeatherLogo & verifyBrokenLinksHomeModule
2. SearchCityWeatherPage.java - contains method i.e. validateSearchCityWeatherPageTitle, validateNoFoundTxt, searchByValidCity & searchByInValidCity
3. SignUpPage - contains method i.e. validateSignUpPageTitle, validatecreateNewAccountTxt, signUpModule
