package com.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFunctions {
	WebDriver driver;
	@FindBy (linkText="Sign in")
	WebElement SignIn;
	
	@FindBy(id="email")
	WebElement email;

	@FindBy(id="passwd")
	WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	WebElement SubmitLogin;
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")

	
	WebElement errorverification;
	
	
	
	public String errorverification(){
		
		
		return errorverification.getText();
		
	}
	
	
	public void Login() {
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.elementToBeClickable(SignIn));
		
		SignIn.click();
		email.sendKeys("automation@gmail.com");
		passwd.sendKeys("password");
		SubmitLogin.click();
	}
	
	
	

}
