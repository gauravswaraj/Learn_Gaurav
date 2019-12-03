package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC15POM {
	private WebDriver driver; 
	
	public TC15POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[1]/a")
		private WebElement homepage; 
			
		public void homepage() {
			this.homepage.click();
		}
		
		@FindBy(xpath="//*[@id=\"navbar\"]/ul[2]/li[2]/a/img")
		private WebElement Logout;
			public void logout() {
				this.Logout.click();
		}
		
		@FindBy(xpath="//*[@id=\"logout_button\"]")
		private WebElement clicklogout;
		public void clicklogout() {
			this.clicklogout.click();

		}
		
}

