package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseCatalogPOM {
	private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[1]/a")
	private WebElement homepage; 
		
	public void homepage() {
		this.homepage.click();
	}
	@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[5]/a[text()='Course catalog']")
	private WebElement courseCatalog; 
	
	
	public void clickCourseCatalog() {
		this.courseCatalog.click();
		

	}
	@FindBy(name="search_term")
	private WebElement coursesearchbox; 
	
	
	public void coursesearchbox(String search) {
		this.coursesearchbox.clear();
		this.coursesearchbox.sendKeys(search);
	}
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement searchbutton; 
	
	
	public void searchbutton() {
		this.searchbutton.click();
	}
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div[1]/div/div[2]/div[4]/div/a")
	private WebElement subscribe;
	public void subscribebutton() {
		this.subscribe.click();
	}		
	
}
