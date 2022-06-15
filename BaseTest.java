package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public void initializeWebdriver(String strURL) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get(strURL);
		
	}
	
	public void tearDownMethod() {
		driver.close();
	}
	
	

}
