package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC14POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_014 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private TC14POM tc14POM;
	private static Properties properties;
	private ScreenShot screenShot;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		tc14POM = new TC14POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority = 1)
	public void validcoursesubscription() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("BeforeCatalog");
		tc14POM.mycourse();
		tc14POM.cour8022();
		tc14POM.Coursedescription();
		screenShot.captureScreenShot("AfterCatalog");
		screenShot.captureScreenShot("cour8022");
		screenShot.captureScreenShot("Coursedescription");
			
		
	}
	
	
}
