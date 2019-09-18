package com.FBconstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartEnd {
	
	public static WebDriver driver;

	static String url = "http://facebook.com";
	
	@BeforeSuite
	public static void starT(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
	}

	
	@AfterSuite
	public static void enD(String[] args) {
		
		driver.close();
		
	}
}
