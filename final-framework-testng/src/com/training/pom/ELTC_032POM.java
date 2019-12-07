package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_032POM {
			private WebDriver driver; 
		
		public ELTC_032POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
}
		 public String randomfunction() 
		    { 
		        // define the range 
		        int max = 99999; 
		        int min = 99; 
		        int range = max - min + 1; 
		        int rand=0;
		        // generate random numbers within 1 to 10 
		        for (int i = 0; i < 10; i++) { 
		            rand = (int)(Math.random() * range) + min; 
		  
		            // Output is different everytime this code is executed 
		           // System.out.println(rand); 
		        } 
		        return String.valueOf(rand);
		    } 
		
		@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[2]/a")
		private WebElement mycourse; 
			
		public void mycourse() {
			this.mycourse.click();	
	}
		@FindBy(xpath="//*[@id='collapse_45']/div/div/div/div/div/div[2]/h4//a[@title='SELENIUM1']")
		private WebElement SELENIUM1; 
			
		public void SELENIUM1() {
			this.SELENIUM1.click();	
	}
		@FindBy(xpath="//*[@title='Tests']")
		private WebElement test; 
			
		public void test() {
			this.test.click();	
}
		@FindBy(xpath="//*[@id='no-data-view']/div/a")
		private WebElement createnewtest; 
			
		public void createnewtest() {
			this.createnewtest.click();	
		}
		@FindBy(id="exercise_title")
		private WebElement testname; 
			
		public void testname(String value) {
			this.testname.clear();
			this.testname.sendKeys(value+randomfunction());
			} 	
		@FindBy(id="advanced_params")
		private WebElement advance; 
			
		public void advance() {
			this.advance.click();	
		}
		@FindBy(xpath="//*[@id='cke_1_contents']/iframe")
		private WebElement iframe; 
		@FindBy(xpath="/html/body/p")
		private WebElement contexttotest;
		public void switchtoiframe(String value1) {
			driver.switchTo().frame(iframe);
			this.contexttotest.sendKeys(value1);
			driver.switchTo().parentFrame();
	}
		@FindBy(id="exerciseType_0")
		private WebElement attheend; 
			
		public void attheend() {
			this.attheend.isEnabled();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)");
		}
		@FindBy(xpath="//*[@id='activate_start_date_check']/label")
		private WebElement enablestart; 
			
		public void enablestart() {
			this.enablestart.click();
		}
		@FindBy(id="pass_percentage")
		private WebElement passpercentage; 
			
		public void passpercentage(String value2) {
			this.passpercentage.clear();
			this.passpercentage.sendKeys(value2);
			}
		@FindBy(id="exercise_admin_submitExercise")
		private WebElement proceed; 
			
		public void proceed() {
			this.proceed.click();
		}
		@FindBy(xpath="//*[@title='Multiple choice']")
		private WebElement multiplechoise; 
			
		public void multiplechoise() {
			this.multiplechoise.click();
		
		}
		@FindBy(id="question_admin_form_questionName")
		private WebElement question; 
			
		public void question(String value3) {
			this.question.clear();
			this.question.sendKeys(value3);
		}
		
		
		
}
