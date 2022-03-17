package com.crm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishw\\OneDrive\\Desktop\\seljars\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
	}

}
