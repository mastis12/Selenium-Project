package com.right.main;

import org.testng.annotations.Test;

import com.mystore.page.Searchpage;
import com.right.Homepage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HomePagemain {
	
	WebDriver driver;
  @Test
  public void f() {
	 Homepage home= new Homepage(driver); 
	 Searchpage s=new Searchpage(driver);
	 home.MainPage();
	 s.Area();
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  

	  System.setProperty("webdriver.chrome.driver", "/Users/shaik/Documents/Selenium jars/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("http://www.rightmove.co.uk/");
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
