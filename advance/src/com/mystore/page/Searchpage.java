package com.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchpage {

	WebDriver driver;
	
	@FindBy (xpath="//class[text()='2 bedroom flat for sale']")
	
	WebElement link;
	
	@FindBy(linkText="Floorplan")
	WebElement Ltest;
	

	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	
	public void Area(){
		link.click();
		Ltest.click();
		
		
	}
}
