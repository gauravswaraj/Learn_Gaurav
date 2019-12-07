package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_031POM {

	private WebDriver driver; 
	
	public ELTC_031POM(WebDriver driver) {
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
	@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[1]/a")
	private WebElement createacourse; 
		
	public void createacourse() {
		this.createacourse.click();	
}
	@FindBy(id="title")
	private WebElement coursename;

	public void coursename(String coursename) {
		this.coursename.clear();
		this.coursename.sendKeys(coursename+randomfunction());
		} 
	@FindBy(id="advanced_params")
	private WebElement advancesearch; 
		
	public void advancesearch() {
		this.advancesearch.click();
}
	@FindBy(xpath="//*[@id='advanced_params_options']/div[1]/div[1]/div/button/div/div/div")
	private WebElement cetegory; 
	@FindBy(xpath="//*[@id='advanced_params_options']/div[1]/div[1]/div/div/div[1]/input")
	private WebElement dropdowninput;
	@FindBy(xpath="//*[@id='advanced_params_options']/div[1]/div[1]/div/div/div[2]/ul/li/a")
	private WebElement firstvalue;
	public void cetegory(String value) {
		this.cetegory.click();
		this.dropdowninput.sendKeys(value);	
		this.firstvalue.click();
	
}
	
	@FindBy(id="add_course_wanted_code")
	private WebElement coursecode; 
		
	public void coursecode(String coursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(coursecode+randomfunction());
		} 
	@FindBy(xpath="//*[@id='advanced_params_options']/div[3]/div[1]/div/button/div/div/div")
	private WebElement language; 
	@FindBy(xpath="//*[@id='advanced_params_options']/div[3]/div[1]/div/div/div[1]/input")	
	private WebElement textbox;
	@FindBy(xpath="//*[@id='advanced_params_options']/div[3]/div[1]/div/div/div[2]/ul/li/a")
	private WebElement english;
	public void language(String value1) {
		this.language.click();
		this.textbox.sendKeys(value1);
		this.english.click();
}
	@FindBy(id="add_course_submit")
	private WebElement createthiscourse; 
		
	public void createthiscourse() {
		this.createthiscourse.click();	
	
}
	@FindBy(xpath="//*[@id='course_tools']/div[1]/div/div[1]/a/em")
	private WebElement introduction; 
		
	public void introduction() {
		this.introduction.click();	
}
	@FindBy(xpath="//*[@id='cke_1_contents']/iframe")
	private WebElement iframe; 
	@FindBy(xpath="/html/body/p")
	private WebElement textbox2;
	public void switchtoiframe(String value3) {
		driver.switchTo().frame(iframe);
		this.textbox2.sendKeys(value3);
		driver.switchTo().parentFrame();
}
	@FindBy(id="introduction_text_intro_cmdUpdate")
	private WebElement savebutton; 
		
	public void savebutton() {
		this.savebutton.click();	
	
}
	@FindBy(xpath="//*[@title='Course description']")
	private WebElement coursedescription; 
		
	public void coursedescription() {
		driver.switchTo().defaultContent();
		this.coursedescription.click();
	
}
	@FindBy(xpath="//*[@id='toolbar']/div/div/a[1]/img")
	private WebElement description; 
		
	public void description() {
		this.description.click();
	
	}
	@FindBy(name="title")
	private WebElement title; 
		
	public void title(String value4) {
		this.title.sendKeys(value4);
	}
	@FindBy(xpath="//*[@id=\'cke_1_contents\']/iframe")
	private WebElement iframe1; 
	@FindBy(xpath="/html/body/p")
	private WebElement textbox3;
	public void switchtoiframe1(String value5) {
		driver.switchTo().frame(iframe1);
		this.textbox2.sendKeys(value5);
		driver.switchTo().parentFrame();
}
	@FindBy(id="course_description_submit")
	private WebElement savebutton1; 
		
	public void savebutton1() {
		this.savebutton1.click();
}
	@FindBy(xpath="//*[@id=\'toolbar\']/div/div/a[3]/img")
	private WebElement topics; 
		
	public void topics() {
		this.topics.click();
}
	@FindBy(id="course_description_title")
	private WebElement title1; 
		
	public void title1(String value6) {
		this.title1.sendKeys(value6);
}
	@FindBy(xpath="//*[@id='cke_1_contents']/iframe")
	private WebElement iframe2; 
	@FindBy(xpath="/html/body/p")
	private WebElement textbox4;
	public void switchtoiframe2(String value7) {
		driver.switchTo().frame(iframe2);
		this.textbox3.sendKeys(value7);
		driver.switchTo().parentFrame();
}
	@FindBy(id="course_description_submit")
	private WebElement savebutton2; 
		
	public void savebutton2() {
		this.savebutton2.click();
}
}


