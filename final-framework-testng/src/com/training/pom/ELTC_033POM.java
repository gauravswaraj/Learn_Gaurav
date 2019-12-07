package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_033POM {
	private WebDriver driver; 
	
	public ELTC_033POM(WebDriver driver) {
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
}
	@FindBy(xpath="//*[@title='Assessments']")
	private WebElement assesment; 
		
	public void assesment() {
		this.assesment.click();
	}
	@FindBy(xpath="//*[@title='Add online activity']")
	private WebElement addassesment; 
		
	public void addassesment() {
		this.addassesment.click();
	}
	
	@FindBy(xpath="//*[@id='create_link']/fieldset/div/div[1]/div/button/div/div/div")
	private WebElement serachonline; 
	@FindBy(xpath="//*[@id='create_link']/fieldset/div/div[1]/div/div/div[1]/input")	
	private WebElement coursetype;
	@FindBy(xpath="//*[@id='create_link']/fieldset/div/div[1]/div/div/div[2]/ul/li/a")
	private WebElement assignments;
	public void language(String value) {
		this.serachonline.click();
		this.coursetype.sendKeys(value);
		this.assignments.click();
	}
	@FindBy(xpath="//*[@id='add_link']/fieldset/div[1]/div[1]/div/button/div/div/div")
	private WebElement activitytoaccess; 
	//@FindBy(xpath="//*[@id='create_link']/fieldset/div/div[1]/div/div/div[1]/input")	
	//private WebElement coursetype;
	@FindBy(xpath="//*[@id='add_link']/fieldset/div[1]/div[1]/div/div/div[2]/ul/li/a")
	private WebElement tests;
	public void choose() {
		this.activitytoaccess.click();
		//this.coursetype.sendKeys(value);
		this.tests.click();
	}
	@FindBy(id="add_link_submit")
	private WebElement addlink; 
		
	public void addlink() {
		this.addlink.click();
	}
	
	

}
