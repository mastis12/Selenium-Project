package com.mystore.main;

import org.testng.annotations.Test;

import com.mystore.page.PageFunctions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LogintoApplication {
	WebDriver driver;
	
  @Test
  public void f()   {
	  
	  PageFunctions page=new PageFunctions();
	  page.Login();
  }
  @BeforeMethod
  @Parameters ("browser")
  public void setup(String browsername) {
	  if(browsername.equalsIgnoreCase("Firefox"))
	  {
			 
			 System.setProperty("webdriver.gecko.driver","/Users/shaik/Documents/Selenium jars/geckodriver");
			 driver =new FirefoxDriver();
				}

			else if (browsername.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "/Users/shaik/Documents/Selenium jars/chromedriver");
			} 
	  driver.get("http://automationpractice.com/index.php");
      
  }
  @AfterMethod
  public void afterMethod() {
  }

}
