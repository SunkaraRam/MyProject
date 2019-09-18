package com.FBlibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatePage {


	
	public static void mani(String[] args) {
		
		String exp,act;
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.linkText("Create a Page")).click();
		
		act = driver.getCurrentUrl();
		
		exp = "registration_form";

		if (exp.toLowerCase().contains(act.toLowerCase())) {
			
			System.out.println("Pass");
			
		}
		
		else {
			
			System.out.println("Pass");
		}
	}

}
