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

import com.training.pom.ELTC_032POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_032 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_032POM eltc_032POM;
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
		eltc_032POM = new ELTC_032POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(priority = 1)
	public void validcoursesubscription() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("BeforeCatalog");
		eltc_032POM.mycourse();
		//Thread.sleep(1000);
		screenShot.captureScreenShot("mycourse");
		eltc_032POM.SELENIUM1();
		eltc_032POM.test();
		eltc_032POM.createnewtest();
		eltc_032POM.testname("online quiz");
		eltc_032POM.advance();
		eltc_032POM.switchtoiframe("quiz");
		eltc_032POM.attheend();
		eltc_032POM.enablestart();
		eltc_032POM.passpercentage("50");
		eltc_032POM.proceed();
		eltc_032POM.multiplechoise();
		eltc_032POM.question("which course your learning");
		screenShot.captureScreenShot("question");
		
		
		
		
		
		
}
}
