package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC14POM {
	private WebDriver driver; 
	
	public TC14POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[2]/a")
	private WebElement mycourse; 
		
	public void mycourse() {
		this.mycourse.click();
}

	@FindBy(xpath="//*[@id=\"collapse_78\"]/div/div/div/div/div/div[2]/h4/a[@title='cour8022']")
	private WebElement cour8022; 
		
	public void cour8022() {
		this.cour8022.click();
}
	@FindBy(id="toolimage_2390")
	private WebElement Coursedescription; 
		
	public void Coursedescription() {
		this.Coursedescription.click();
	}
	
		
	
}
