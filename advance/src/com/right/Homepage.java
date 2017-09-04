package com.right;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='searchLocation']")
	WebElement text;
    
	@FindBy(id="buy")
	WebElement buy;
	
	@FindBy(id="submit")
	WebElement button;

	

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}




	public void MainPage() {
		
		text.sendKeys("TW134GS");
		System.out.println("this is Git");
		buy.click();
		
       button.click();		
	}

	
}