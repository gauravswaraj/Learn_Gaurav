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
import com.training.pom.ELTC_031POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_031 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_031POM eltc_031POM;
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
		eltc_031POM = new ELTC_031POM(driver);
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
		eltc_031POM.mycourse();
		//Thread.sleep(1000);
		screenShot.captureScreenShot("mycourse");
		eltc_031POM.createacourse();
		eltc_031POM.coursename("abdgughj");
		screenShot.captureScreenShot("selenium");
		eltc_031POM.advancesearch();
		eltc_031POM.cetegory("Projects");
		eltc_031POM.coursecode("abdn123445");
		eltc_031POM.language("ENGLISH");
		eltc_031POM.createthiscourse();
		screenShot.captureScreenShot("createthiscourse");
		eltc_031POM.introduction();
		eltc_031POM.switchtoiframe("This is an selenium course");
		screenShot.captureScreenShot("switchtoiframe");
		eltc_031POM.savebutton();
		screenShot.captureScreenShot("savebutton");
		eltc_031POM.coursedescription();
		eltc_031POM.description();
		eltc_031POM.title("selenium course for beginners");
		eltc_031POM.switchtoiframe1("selenium course for beginners");
		screenShot.captureScreenShot("switchtoiframe1");
		eltc_031POM.savebutton1();
		eltc_031POM.topics();
		eltc_031POM.title1("selenium course for beginners");
		eltc_031POM.switchtoiframe2("selenium course for beginners");
		screenShot.captureScreenShot("switchtoiframe2");
		eltc_031POM.savebutton2();
		
		
		
		
		
		
				
		
	}
}

